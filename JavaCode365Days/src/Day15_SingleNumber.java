
// Day 15 - Find the single number without a duplicate, in an
// int array of duplicate numbers.
// June 6th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n)

import java.util.HashSet;

public class Day15_SingleNumber {

    public int singleNumber(int[] nums) {
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i : nums) {
            if (h.contains(i)) {
                h.remove(i);
            } else {
                h.add(i);
            }
        }

        return h.iterator().next();
    }

    public static void main(String[] args) {
        Day15_SingleNumber c = new Day15_SingleNumber();
        int[] nums1 = {1, 2, 1, 4, 5, 5, 4};
        System.out.println(c.singleNumber(nums1));
        // Should output 2

    }
}

