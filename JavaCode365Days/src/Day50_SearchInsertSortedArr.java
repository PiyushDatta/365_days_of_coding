
// Day 50 - Return index of target in sorted array, return where it
// should be if the target is not in the array
// July 11th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(1), 6ms Solution

import java.util.*;

public class Day50_SearchInsertSortedArr {

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                return i;
            }

        }

        return nums.length;
    }

    public static void main(String[] args) {
        Day50_SearchInsertSortedArr c = new Day50_SearchInsertSortedArr();
        int[] s1 = {1, 3, 5, 6};
        int target1 = 5;
        // 2
        System.out.println(c.searchInsert(s1, target1));
    }
}
