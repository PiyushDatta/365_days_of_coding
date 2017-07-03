
// Day 41 - Return a list, containing the bit counts (number of 1s) of 
// each number, from 0 to and including num
// July 2nd, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 2ms Solution

import java.util.Arrays;

public class Day41_IntCountBits {

    public int[] countBits(int num) {
        int[] res = new int[num + 1];

        for (int i = 0; i < num + 1; i++) {
            // Alternative solution
            // res[i] = Integer.bitCount(i);
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }


    public static void main(String[] args) {
        Day41_IntCountBits c = new Day41_IntCountBits();
        int s3 = 5;
        // [0, 1, 1, 2, 1, 2]
        System.out.println(Arrays.toString(c.countBits(s3)));
    }

}
