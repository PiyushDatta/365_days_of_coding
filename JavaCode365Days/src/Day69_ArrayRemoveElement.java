
// Day 69 - Return length of array without indices that equal val
// July 30th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(1), 14ms Solution

import java.util.*;

public class Day69_ArrayRemoveElement {

    public int removeElement(int[] nums, int val) {

        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        Day69_ArrayRemoveElement c = new Day69_ArrayRemoveElement();
        int[] s1 = {3, 2, 2, 3};
        int s2 = 3;
        // [2, 2]
        // 2
        System.out.println(c.removeElement(s1, s2));

    }
}
