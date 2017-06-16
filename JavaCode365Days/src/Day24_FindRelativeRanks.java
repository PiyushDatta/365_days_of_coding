
// Day 24 - Find the relative ranks for each int value, 1-3 ranks are medals
// June 15th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n**2), 288ms Solution

import java.util.Arrays;

public class Day24_FindRelativeRanks {
    public String[] findRelativeRanks(int[] nums) {

        String[] res = new String[nums.length];
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int counter = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (temp[i] == nums[j]) {
                    if (i == nums.length - 1) {
                        res[j] = "Gold Medal";
                    } else if (i == nums.length - 2) {
                        res[j] = "Silver Medal";
                    } else if (i == nums.length - 3) {
                        res[j] = "Bronze Medal";
                    } else if (temp[i] == nums[j]) {
                        res[j] = Integer.toString(counter);
                        counter--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Day24_FindRelativeRanks c = new Day24_FindRelativeRanks();
        int[] nums1 = {5, 4, 3, 2, 1};
        for (String k : c.findRelativeRanks(nums1)) {
            System.out.println(k);
        }
    }
}