
// Day 26 - Find the missing numbers in arraylist
// June 17th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 70ms Solution

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Day26_FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> temp = new HashSet<>();

        for (int i = 1; i < nums.length + 1; i++) {
            temp.add(i);
        }

        for (int j : nums) {
            temp.remove(j);
        }

        for (int k : temp) {
            res.add(k);
        }

        return res;
    }

    public static void main(String[] args) {
        Day26_FindDisappearedNumbers c = new Day26_FindDisappearedNumbers();
        int[] n1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Before: " + Arrays.toString(n1));
        System.out.println("After: " + c.findDisappearedNumbers(n1).toString());
    }
}
