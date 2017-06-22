
// Day 30 - Add one to the integer, which is represented by an int array 
// June 21th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 0ms Solution

import java.util.Arrays;

public class Day30_PlusOne {
    public int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        } else {
            int nonZero = -1;
            for (int i = digits.length - 1; i > -1; i--) {
                if (digits[i] < 9) {
                    nonZero = i;
                    break;
                }
            }

            if (nonZero != -1) {
                digits[nonZero]++;
                for (int j = nonZero + 1; j < digits.length; j++) {
                    digits[j] = 0;
                }
            } else {
                digits[0] = 1;
                for (int k = 1; k < digits.length; k++) {
                    digits[k] = 0;
                }
                digits = extendArraySize(digits);
            }
            return digits;
        }
    }

    public int[] extendArraySize(int[] array) {
        int[] temp = array.clone();
        array = new int[array.length + 1];
        System.arraycopy(temp, 0, array, 0, temp.length);
        return array;
    }

    public static void main(String[] args) {
        Day30_PlusOne c = new Day30_PlusOne();
        int[] digits1 = {2, 4, 9, 3, 9};
        System.out.println(Arrays.toString(c.plusOne(digits1)));
    }
}
