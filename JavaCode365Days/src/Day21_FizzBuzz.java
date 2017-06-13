
// Day 21 - FizzBuzz
// June 12th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), ms Solution

import java.util.ArrayList;
import java.util.List;

public class Day21_FizzBuzz {

    public List<String> fizzBuzz(int nums) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= nums; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Day21_FizzBuzz c = new Day21_FizzBuzz();
        int nums1 = 15;
        System.out.println(c.fizzBuzz(nums1));
    }
}

