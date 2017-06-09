
// Day 18 - Find the sum of 2 numbers, without using + or - operators
// June 9th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(1)

public class Day18_GetSum {

    public int getSum(int a, int b) {
        
        if (b == 0){
            return a;
        }

        if (a == 0){
            return b;
        }
        
        int add = a ^ b;
        int carry = (a&b) << 1;

        return getSum(add, carry);
    }

    public static void main(String[] args) {
        Day18_GetSum c = new Day18_GetSum();
        int a1 = 16;
        int b1 = 15;
        System.out.println(c.getSum(a1, b1));
        // Should return 31
    }

}
