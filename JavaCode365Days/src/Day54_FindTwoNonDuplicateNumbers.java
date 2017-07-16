
// Day 54 - Return the 2 numbers that only show up once
// July 15th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(n), 13ms Solution

import java.util.*;

public class Day54_FindTwoNonDuplicateNumbers {

    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        HashSet<Integer> temp = new HashSet<>();
        HashSet<Integer> temp2 = new HashSet<>();

        for (int i : nums) {
            if (!temp.contains(i)) temp.add(i);
            else temp2.add(i);
        }

        for (int i : nums) {
            if (!temp2.contains(i)) {
                if (res[0] == 0) res[0] = i;
                else res[1] = i;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Day54_FindTwoNonDuplicateNumbers c = new Day54_FindTwoNonDuplicateNumbers();
        int[] s1 = {1403617094, -490450406, -1756388866, -967931676, 1878401007, 1878401007, -74743538, 1403617094,
                -1756388866, -74743538, -490450406, -1895772685};
        // [-1895772685,-967931676] or [-967931676, -1895772685]
        System.out.println(Arrays.toString(c.singleNumber(s1)));
    }
}
