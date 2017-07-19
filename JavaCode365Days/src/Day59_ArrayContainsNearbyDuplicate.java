
// Day 59 - Return the two indices with the same number in the array, as
// long as the difference between the indices are not greater than k
// July 20th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(n), 18ms Solution

import java.util.*;

public class Day59_ArrayContainsNearbyDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> res = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (res.containsKey(nums[i])) {
                if (Math.abs(res.get(nums[i]) - i) <= k) return true;
                else res.put(nums[i], i);
            } else {
                res.put(nums[i], i);
            }
        }

        return false;

    }

    public static void main(String[] args) {
        Day59_ArrayContainsNearbyDuplicate c = new Day59_ArrayContainsNearbyDuplicate();
        int[] s2 = {2, 3, 5, 4, 2, 7, 11, 15};
        int s3 = 5;
        // true
        System.out.println(c.containsNearbyDuplicate(s2, s3));
    }
}
