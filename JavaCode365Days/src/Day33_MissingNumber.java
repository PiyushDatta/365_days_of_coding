
// Day 33 - Determine missing number in range of numbers
// June 24th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 34ms Solution

import java.util.HashSet;

public class Day33_MissingNumber {

    public int missingNumber(int[] nums) {

        HashSet<Integer> res = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            res.add(i);
        }

        for (int j : nums) {
            if (res.contains(j)) {
                res.remove(j);
            }
        }

        if (res.isEmpty()) {
            return nums.length;
        } else {
            res.remove(nums.length);
            return res.toArray(new Integer[1])[0];
        }
    }

    public static void main(String[] args) {
        Day33_MissingNumber c = new Day33_MissingNumber();
        int[] s1 = {0, 2};
        System.out.println(c.missingNumber(s1));

    }
}
