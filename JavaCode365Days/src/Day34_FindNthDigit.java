
// Day 34 - Find the nth digit in sequence of n numbers.
// June 25th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 898ms Solution

public class Day34_FindNthDigit {
    
    public int findNthDigit(int n) {

            int maxInt = n;
            int i = 0;
            int digits = 1;
            int incr = 1;

            while (maxInt > 0) {
                i++;
                if (i >= digits * 10) {
                    incr++;
                    digits *= 10;
                }
                maxInt -= incr;
            }

            String strInt = String.valueOf(i);
            char[] chArr = strInt.toCharArray();

            for (int j : chArr) {
                maxInt++;
            }

            return Character.getNumericValue(chArr[maxInt - 1]);
        }

    public static void main(String[] args) {
        Day34_FindNthDigit c = new Day34_FindNthDigit();
        int s1 = 143;
        System.out.println(c.findNthDigit(s1));
    }
}
