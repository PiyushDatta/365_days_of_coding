
// Day 23 - Find and return a list of duplicates from another list
// June 14th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 47ms Solution

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Day23_FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> res = new ArrayList<>();
        HashSet<Integer> all = new HashSet<>();

        for (int i : nums) {
            if (all.contains(i)) {
                res.add(i);
            } else {
                all.add(i);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Day23_FindDuplicates c = new Day23_FindDuplicates();
        int[] nums1 = {5, 1, 1, 1, 2, 2, 2, 3, 3, 3};
        for (int k : c.findDuplicates(nums1)) {
            System.out.println(k);
        }
    }
}

