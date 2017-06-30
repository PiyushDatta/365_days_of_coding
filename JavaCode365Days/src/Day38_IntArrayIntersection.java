
// Day 38 - Return the intersection of two int arrays
// June 29th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 5ms Solution

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Day38_IntArrayIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> temp = new HashSet<>();
        ArrayList<Integer> temp2 = new ArrayList<>();


        for (int i : nums1) {
            temp.add(i);
        }

        for (int j : nums2) {
            if (temp.contains(j)) {
                temp.remove(j);
                temp2.add(j);
            }
        }

        int[] res = new int[temp2.size()];

        for (int k = 0; k < temp2.size(); k++) {
            res[k] = temp2.get(k);
        }

        return res;
    }

    public static void main(String[] args) {
        Day38_IntArrayIntersection c = new Day38_IntArrayIntersection();
        int[] s1 = {0, 1, 2, 0, 12};
        int[] s2 = {2, 2};
        // [2]
        System.out.println(Arrays.toString(c.intersection(s1, s2)));
    }
}
