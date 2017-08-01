
// Day 71 - Return true if the int array contains a duplicate
// August 1st, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(n), 21ms Solution

import java.util.*;

public class Day71_IntArrayContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<>();
        
        for (int i : nums){
            if (res.contains(i)) return true;
            res.add(i);
        }

        return false;
    }

    public static void main(String[] args) {
        Day71_IntArrayContainsDuplicate c = new Day71_IntArrayContainsDuplicate();
        int[] s1 = {3, 2, 1, 3};
        // true
        System.out.println(c.containsDuplicate(s1));
    }
}

