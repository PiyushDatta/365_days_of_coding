
// Day 20 - Array partition, find sums of a 2n int array.
// June 11th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n*log(n)), 70ms solution

import java.util.Arrays;

public class Day20_ArrayPartitionI {

    public int arrayPairSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else {
            int sum = 0;
            int i = 0;
            Arrays.sort(nums);

            while (i <= nums.length - 1) {
                sum += nums[i];
                i += 2;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Day20_ArrayPartitionI c = new Day20_ArrayPartitionI();
        int[] nums1 = {1, 2, 3, 5, 6, 2, 4, 5};
        System.out.println(c.arrayPairSum(nums1));
        // Should return 12
    }
}