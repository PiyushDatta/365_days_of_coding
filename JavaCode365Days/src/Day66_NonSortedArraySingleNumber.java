
// Day 66 - Return a number that appears once in an array with
// numbers that appear exactly three time
// July 27th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(n), 14ms Solution

import java.util.*;

public class Day66_NonSortedArraySingleNumber {

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<>();
        int ret = -1;

        for (int i = 0; i < nums.length; i++) {
            if (res.containsKey(nums[i])) res.put(nums[i], res.get(nums[i]) + 1);
            else res.put(nums[i], 1);
        }

        for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }

        return ret;
    }


    public static void main(String[] args) {
        Day66_NonSortedArraySingleNumber c = new Day66_NonSortedArraySingleNumber();
        int[] s3 = {1, 1, 3, 1, 2, 2, 4, 5, 4, 5, 2, 5, 4};
        System.out.println(c.singleNumber(s3));
    }
}
