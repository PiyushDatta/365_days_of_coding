
// Day 52 - Return true if target number is in rotated-sorted array
// July 13th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(n), 2ms Solution

import java.util.*;

public class Day52_SearchRotatedSortedArray {

    public boolean search(int[] nums, int target) {

        if (nums.length == 1) {
            if (nums[0] == target) return true;
            else return false;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return true;
            if (i+1 != nums.length && nums[i] > nums[i + 1] && target > nums[0]) return false;
        }

        return false;
    }

    public static void main(String[] args) {
        Day52_SearchRotatedSortedArray c = new Day52_SearchRotatedSortedArray();
        int[] s1 = {4, 5, 6, 7, 0, 1, 2};
        // true
        System.out.println(c.search(s1, 1));
    }
}
