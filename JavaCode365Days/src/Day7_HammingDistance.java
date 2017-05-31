
// Day 7 - Hamming Distance (find the points on the  
// binary representations of the numbers that are different) 
// May 29th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(1)

public class Day7_HammingDistance {

	public int hammingDistance(int x, int y) {
		// XOR
		// O(1)
        return Integer.bitCount(x^y);
    }

	public static void main(String[] args) {
		Day7_HammingDistance c = new Day7_HammingDistance();
		int int1 = 4;
		int int2 = 1;
		System.out.println(c.hammingDistance(int1, int2));
	}
}