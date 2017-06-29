
// Day 37 - Return the integer reversed, and return 0 if int overflow
// June 28th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 37ms Solution

public class Day37_IntReverse {
    public int reverse(int x) {

        long res = 0;
        boolean isNeg = x < 0;

        if (isNeg) {
            x *= -1;
        }

        while (x > 0) {
            res = (res * 10) + x % 10;
            x /= 10;
        }

        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }

        x = (int) res;
        return isNeg ? x * -1 : x;
    }

    public static void main(String[] args) {
        Day37_IntReverse c = new Day37_IntReverse();
        int s1 = -132;
        System.out.println(c.reverse(s1));
        // Should be -231
    }

}
