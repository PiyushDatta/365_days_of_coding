
// Day 22 - Add Digits of a number, and only return it once it is a single
// digit number
// June 13th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(logn), 2ms Solution

public class Day22_AddDigits {

    public int addDigits(int num) {
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        if (sum < 10){
            return sum;
        }
        else{
            return addDigits(sum);
        }
    }

    public static void main(String[] args) {
        Day22_AddDigits c = new Day22_AddDigits();
        int nums1 = 38;
        System.out.println(c.addDigits(nums1));
    }
}

