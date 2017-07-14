
// Day 53 - Return the lenght of the integer list, without duplicates
// July 14th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(n), 14ms Solution

import java.util.*;

public class Day53_RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[count] != nums[i]) {
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        Day53_RemoveDuplicatesSortedArray c = new Day53_RemoveDuplicatesSortedArray();
        int[] s1 = {1, 1, 2, 3, 4};
        // 4
        System.out.println(c.removeDuplicates(s1));
        // [1, 2, 3, 4, 4]
        System.out.println(Arrays.toString(s1));
    }
}
