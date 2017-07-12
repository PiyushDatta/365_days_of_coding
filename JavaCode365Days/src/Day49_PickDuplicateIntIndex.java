
// Day 49 - Pick random index of subarray of duplicate integers
// July 10th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), 393ms Solution

import java.util.ArrayList;
import java.util.Random;

public class Day49_PickDuplicateIntIndex {

    int[] nums;

    public Day49_PickDuplicateIntIndex(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < this.nums.length; i++) {
            if (this.nums[i] == target) res.add(i);
        }

        int ret = res.get(new Random().nextInt(res.size()));
        return ret;
    }
}
