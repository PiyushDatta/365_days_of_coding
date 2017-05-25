
// Day 2 - AddOneToNumber ArrayList
// May 24th, 2017
// Interviewbit.com 
// Under category Arrays
// Big Oh: O(n^2)
import java.util.ArrayList;

public class DayTwo_AddOneToNumber {

	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		// If vector has [1, 2, 3]
		// returned vector should be [1, 2, 4]
		// 123 + 1 = 124

		// If [int]
		if (a.size() == 1) {
			if (a.get(0) == 0) {
				a.remove(0);
				a.add(1);
				return a;

			} else {
				if (a.get(0) == 9) {
					a.set(0, 1);
					a.add(0);
					return a;
				} else {
					a.set(0, (a.get(0) + 1));
					return a;
				}

			}
		}

		// If []
		else if (a.size() == 0) {
			return a;
		}

		// Else, every other case
		else {

			while (a.get(0) == 0) {
				a.remove(0);
			}

			int lastIndex = a.size() - 1;
			int lastInt = a.get(lastIndex);

			if (lastInt == 9) {
				a.set(lastIndex, 0);
				lastIndex--;
				while (lastIndex != -1) {
					if (a.get(lastIndex) < 9) {
						a.set(lastIndex, a.get(lastIndex) + 1);
						return a;
					} else {
						a.set(lastIndex, 0);
						lastIndex--;
					}
				}

				if (a.get(0) == 0) {
					a.set(0, 1);
					a.add(0);
				}
				return a;
			} else {
				a.set(lastIndex, lastInt + 1);
				return a;
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(9);
		a1.add(9);
		a1.add(9);
		a1.add(9);
		a1.add(9);
		a1.add(9);
		a1.add(9);
		a1.add(9);
		a1.add(9);
		a1.add(9);
		a1.add(9);
		a1.add(9);
		DayTwo_AddOneToNumber c = new DayTwo_AddOneToNumber();
		System.out.println(c.plusOne(a1));
	}
}
