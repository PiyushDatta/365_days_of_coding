
// Day 9 - Next Greater Element (to the right of the number) 
// May 31st, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n^2)

public class Day9_nextGreaterElement {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {

        int[] ret = new int[findNums.length];

        // Base case
        if (findNums.length == nums.length && findNums.length == 1) {
            ret[0] = -1;
            return ret;
        }

        // Check if there is a greater element
        for (int i = 0; i < findNums.length; i++) {
            int j = 0;
            // Check which nums index has findNums[i]
            while (j < nums.length) {
                if (nums[j] == findNums[i]) {
                    break;
                } else j++;
            }

            // Check whether the nums index is the last index in nums
            // If it is, then nothing right of it can be greater
            if (j + 1 == nums.length) ret[i] = -1;

            // If it is not the last index
            // Check if there is a greater number after this index
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[k] > findNums[i]) {
                    ret[i] = nums[k];
                    break;
                } else {
                    ret[i] = -1;
                }

            }

        }
        return ret;
    }

    public static void main(String[] args) {
        Day9_nextGreaterElement c = new Day9_nextGreaterElement();
        int[] findNums1 = {4, 1, 2};
        int[] nums1 = {1,3,4,2};
        for (int i : c.nextGreaterElement(findNums1, nums1)) {
            System.out.println(i);
        }

    }
}
