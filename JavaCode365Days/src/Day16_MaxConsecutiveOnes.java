
// Day 16 - Find max consecutive ones in a binary array
// June 7th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n)

public class Day16_MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSum = 0;
        int sum1 = 0;
        for (int i : nums) {
            if (i == 0) {
                if (sum1 > maxSum) {
                    maxSum = sum1;
                }
                sum1 = 0;
            } else {
                sum1++;
            }
        }

        if (sum1 > maxSum){
            return sum1;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Day16_MaxConsecutiveOnes c = new Day16_MaxConsecutiveOnes();
        int[] nums1 = {1};
        System.out.println(c.findMaxConsecutiveOnes(nums1));
        // Should output 1

    }
}

