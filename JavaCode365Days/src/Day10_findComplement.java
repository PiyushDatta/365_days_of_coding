
// Day 10 - Find Complement. Find the complement to the binary
// code. So 010 would turn into 101. Interesting one-liner I found
// in forums. I was going to do a O(n) solution, but this is 
// better
// June 1st, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(1)

public class Day10_findComplement {

    public int findComplement(int num) {
        return ~num & (Integer.highestOneBit(num) - 1);
    }


    public static void main(String[] args) {
        Day10_findComplement c = new Day10_findComplement();
        int target1 = 5;
        System.out.println(c.findComplement(target1));

    }
}
