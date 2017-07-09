
// Day 48 - Return true if integer is the same when reversed
// July 9th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(n), 343ms Solution

import java.util.ArrayList;

public class Day48_IntIsPalindrome {

    public boolean isPalindrome(int x) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean isNeg = false;

        if (x == 0) return true;
        if (x < 10 && x > 0) return true;
        if (x < 10 && x > -10) return false;
        if (x < 0){
            x *= -1;
            isNeg = true;
        }

        while (x != 0) {
            res.add(x % 10);
            x = x / 10;
        }

        if (isNeg){
            res.set(0, res.get(0)*(-1));
        }

        for (int i = 0; i < res.size(); i++) {
            if (res.get(i) != res.get(res.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Day48_IntIsPalindrome c = new Day48_IntIsPalindrome();
        int s3 = -2147447412;
        // false
        System.out.println(c.isPalindrome(s3));
    }
}
