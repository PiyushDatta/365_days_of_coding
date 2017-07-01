
// Day 39 - Implement the int sqrt function
// June 30th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 2ms Solution

public class Day39_IntMySqrt {
    public int mySqrt(int x) {
        // Another solution
        // return (int)Math.pow((double)x, 0.5);
        long res = x;

        while (res*res > x)
            res = (res + x/res) / 2;

        return (int) res;
    }

    public static void main(String[] args) {
        Day39_IntMySqrt c = new Day39_IntMySqrt();
        int s3 = 144;
        // 12
        System.out.println(c.mySqrt(s3));
    }

}
