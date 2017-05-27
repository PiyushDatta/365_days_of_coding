
// Day 4 - Two Sum 
// May 26th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n^2)

// For testing purposes, this import isn't used in actual code.
import java.util.Arrays;

public class Day4_TwoSum {

	public int[] twoSum(int[] nums, int target) {
		// Return index of the two values in the 
		// primitive Array that equal the target 

		int[] noArr = {};
		// Base Cases
		if (nums.length == 1) {
			int[] retArr = { 0 };
			return retArr;
		} else if (nums.length == 0) {
			return noArr;
		}
		// Worst Case. O(n^2).
		else {
			for (int i = 0; i < nums.length; i++) {
				int new_num = target - nums[i];
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] == new_num) {
						int[] retArr = { i, j };
						return retArr;
					}
				}
			}
		}
		return noArr;
	}

	public static void main(String[] args) {
		Day4_TwoSum c = new Day4_TwoSum();
		int[] nums1 = { 3, 2, 4 };
		int target1 = 6;
		System.out.println(Arrays.toString(c.twoSum(nums1, target1)));
	}
}