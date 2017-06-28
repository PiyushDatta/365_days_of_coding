
// Day 35 - Return true if the number is a power of two
// June 26th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 3ms Solution

public class Day35_IsPowerofTwo {
	
	public boolean isPowerofTwo(int n) {
	    return ((Math.log(n) / Math.log(2)) % 1 <= 0.000000001);
	}

    public static void main(String[] args) {
        Day35_IsPowerofTwo c = new Day35_IsPowerofTwo();
        int s1 = 32;
        System.out.println(c.isPowerofTwo(s1));

    }
}
