
// Day 3 - Max Non Negative Sub Array 
// May 25th, 2017
// Interviewbit.com 
// Under category Arrays
// Big Oh: O(n^2)
import java.util.ArrayList;

public class Day3_MaxNonNegativeSubArray {

	// Calculate the sum of the integers of an ArrayList
	public long sumElements(ArrayList<Integer> b) {
		long sum = 0;
		for (long d : b) {
			sum += d;
		}
		return sum;
	}

	// Main method
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {

		// Declare useful variables
		long maxSum = 0;
		int startInd = 0;
		int finArrInd = a.size();
		int tempArrInd = a.size();
		int i = 0;
		ArrayList<Integer> finArr = new ArrayList<>();
		ArrayList<Integer> tempArr = new ArrayList<>();
		ArrayList<Integer> subArr;

		// Check base cases
		if (a.size() <= 1 && this.sumElements(a) > -1) {
			return a;
		} else if (a.size() <= 1 && this.sumElements(a) < 0) {
			return finArr;
		}

		else {
			// O(n^2) because of the sumElements method being O(n).
			while (i < a.size()) {

				if (a.get(i) < 0) {
					subArr = new ArrayList<>(a.subList(startInd, i + 1));
					startInd = i + 1;
					i++;
				} else {
					subArr = new ArrayList<>(a.subList(startInd, i + 1));
					i++;
				}

				// Check whether this sub array is the final sub array that has
				// to be returned
				if ((maxSum == this.sumElements(subArr) && subArr.size() > finArr.size())
						|| this.sumElements(subArr) > maxSum) {
					maxSum = this.sumElements(subArr);
					finArr = subArr;
					finArrInd = startInd;
				}
				// If equal to the final sub array, store it as a temp array and
				// compare after
				else if (this.sumElements(subArr) == maxSum) {
					tempArr = subArr;
					tempArrInd = startInd;
				}

			}

			// If there is a temp sub array, then go through the rules
			// Otherwise just return the final sub array
			if (tempArr.isEmpty()) {
				return finArr;
			}
			if (tempArr.size() > finArr.size()) {
				return tempArr;
			} else if (tempArr.size() < finArr.size()) {
				return finArr;
			} else {
				if (tempArrInd > finArrInd) {
					return finArr;
				} else {
					return tempArr;
				}

			}

		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(0);
		a1.add(0);
		a1.add(-1);
		a1.add(0);
		Day3_MaxNonNegativeSubArray c = new Day3_MaxNonNegativeSubArray();
		System.out.println(c.maxset(a1));
	}
}
