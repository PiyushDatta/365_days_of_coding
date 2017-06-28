
// Day 36 - Return true if the number is a perfect square (like 144)
// June 27th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 757ms Solution

public class Day36_IsPerfectSquare {
    public boolean isPerfectSquare(int num) {

        int checkInt = 2;

        if (num == 0) return false;
        if (num == 1) return true;
        if (num == 2) return false;

        while (checkInt * checkInt <= num) {
            if (checkInt * checkInt == num) {
                return true;
            }

            if (checkInt >= num / 2) {
                return false;
            }

            checkInt++;
        }

        return false;

    }

    public static void main(String[] args) {
        Day36_IsPerfectSquare c = new Day36_IsPerfectSquare();
        int s1 = 2147483647;
        // false
        System.out.println(c.isPerfectSquare(s1));
    }

}
