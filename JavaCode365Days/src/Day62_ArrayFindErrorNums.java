
// Day 62 - Find the minimum value in a rotated array
// July 23rd, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(n), 46ms Solution

import java.util.*;

public class Day62_ArrayFindErrorNums {
    public int[] findErrorNums(int[] nums) {

        HashSet<Integer> res = new HashSet<>();
        int[] ret = new int[2];
        int dup = -1;
        int maxInt = -1;
        ret[0] = dup;
        ret[1] = dup;

        for (int i : nums) {
            if (res.contains(i)) {
                dup = i;
            }
            if (i > maxInt) maxInt = i;
            res.add(i);
        }

        int j = 1;
        while (j <= maxInt + 1) {
            if (!res.contains(j)) {
                ret[0] = dup;
                ret[1] = j;
                return ret;
            }
            j++;
        }

        return ret;
    }

    public static void main(String[] args) {
        Day62_ArrayFindErrorNums c = new Day62_ArrayFindErrorNums();
        int[] s2 = {1, 5, 3, 2, 2, 7, 6, 4, 8, 9};
        // [2, 10]
        System.out.println(Arrays.toString(c.findErrorNums(s2)));
    }
}
