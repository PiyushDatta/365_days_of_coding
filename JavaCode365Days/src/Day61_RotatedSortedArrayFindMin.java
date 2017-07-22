
// Day 61 - Find the minimum value in a rotated array
// July 22nd, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(n), 0ms Solution

import java.util.*;

public class Day61_RotatedSortedArrayFindMin {

    public int findMin(int[] nums) {

        if (nums.length == 1) return nums[0];

        if (nums[0] > nums[1]) return nums[1];

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) break;
            if (nums[i] > nums[i + 1]) return nums[i + 1];
        }

        return (nums[0] > nums[nums.length - 1] ? 
            nums[nums.length - 1] : nums[0]);
    }

    public static void main(String[] args) {
        Day61_RotatedSortedArrayFindMin c = new Day61_RotatedSortedArrayFindMin();
        int[] s2 = {3, 4, 5, 6, 1, 2};
        // 1
        System.out.println(c.findMin(s2));

    }
}
