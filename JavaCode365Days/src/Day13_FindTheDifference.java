
// Day 13 - Find the character difference between 2 strings
// June 4th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n)

public class Day13_FindTheDifference {

	public char findTheDifference(String s, String t) {
		char ret = 0;

		for (char i: s.toCharArray()) {
			ret ^= i;
		}

		for (char j: t.toCharArray()) {
			ret ^= j;
		}

		return ret;
	}

	public static void main(String[] args) {
		Day13_FindTheDifference c = new Day13_FindTheDifference();
		String s1 = "hello";
		String s2 = "helloe";
		System.out.println(c.findTheDifference(s1, s2));

	}
}
