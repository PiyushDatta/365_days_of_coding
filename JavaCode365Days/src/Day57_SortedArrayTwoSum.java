
// Day 57 - Return the two numbers in array that add up to target and
// return the indexes (add 1 to each index).
// July 18th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(n), 5ms Solution

import java.util.*;

public class Day57_SortedArrayTwoSum {

    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> res = new HashMap<>();
        int[] finRes = new int[2];

        for (int i = 0; i < numbers.length; i++) {

            if (res.containsKey(target - numbers[i])) {
                finRes[0] = res.get(target - numbers[i]);
                finRes[1] = i + 1;
                return finRes;
            }

            res.put(numbers[i], i + 1);
        }

        return finRes;
    }

    public static void main(String[] args) {
        Day57_SortedArrayTwoSum c = new Day57_SortedArrayTwoSum();
        int[] s2 = {2, 7, 11, 15};
        int s3 = 9;
        // [1, 2]
        System.out.println(Arrays.toString(c.twoSum(s2, s3)));
    }
}
