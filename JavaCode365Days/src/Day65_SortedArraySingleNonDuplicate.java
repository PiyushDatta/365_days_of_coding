
// Day 65 - Return a number that appears once in a sorted array with
// numbers that appear exactly twice
// July 26th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(logn), Space complexity: O(1), 1ms Solution

import java.util.*;

public class Day65_SortedArraySingleNonDuplicate {

    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i-1]) i++;
            else return nums[i-1];
        }

        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        Day65_SortedArraySingleNonDuplicate c = new Day65_SortedArraySingleNonDuplicate();
        int[] s2 = {1,1,2,3,3,4,4,8,8};
        // 2
        System.out.println(c.singleNonDuplicate(s2));
    }
}

