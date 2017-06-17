
// Day 25 - Move all the zeroes in an int array to the end
// June 16th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 1ms Solution

import java.util.Arrays;

public class Day25_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int numsLen = nums.length;
        int zeroCount = 0;
        int place = 0;
        int[] temp = new int[numsLen];

        for (int i = 0; i < numsLen; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                temp[place] = nums[i];
                place++;
            }
        }

        for (int j = 0; j < temp.length; j++) {
            nums[j] = temp[j];
        }

        for (int k = numsLen - 1; zeroCount > 0; k--) {
            nums[k] = 0;
            zeroCount--;
        }

    }

    public static void main(String[] args) {
        Day25_MoveZeroes c = new Day25_MoveZeroes();
        int[] n1 = {0, 1, 0, 3, 12};
        System.out.println("Before: " + Arrays.toString(n1));
        c.moveZeroes(n1);
        System.out.println("After: " + Arrays.toString(n1));
    }
}