
// Day 29 - Find the majority element (exists > n/2 times in array)  
// June 20th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 31ms Solution

import java.util.HashMap; 

public class Day29_MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<>();

        for (int i : nums) {
            if (res.containsKey(i)) {
                res.put(i, res.get(i) + 1);
            } else {
                res.put(i, 1);
            }
        }

        int maxKey = 0;
        int maxVal = 0;

        for (HashMap.Entry<Integer, Integer> entry : res.entrySet()) {
            if (entry.getValue() > maxVal) {
                maxVal = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
        Day29_MajorityElement c = new Day29_MajorityElement();
        int[] nums1 = {3, 2, 3};
        System.out.println(c.majorityElement(nums1));
    }
}
