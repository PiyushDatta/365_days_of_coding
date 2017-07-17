
// Day 56 - Return false if more than 1 A or more than 2 consecutive L's
// July 17th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(1), 11ms Solution

import java.util.*;

public class Day56_AttendanceCheckRecord {

    public boolean checkRecord(String s) {

        int countA = 0;
        int countL = 0;

        for (char i : s.toCharArray()) {
            if (i == 'A') countA++;

            if (countA > 1) return false;

            if (i == 'L') {
                countL++;
            } else {
                countL = 0;
            }

            if (countL > 2) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Day56_AttendanceCheckRecord c = new Day56_AttendanceCheckRecord();
        String s5 = "PPALLL";
        // false
        System.out.println(c.checkRecord(s5));

    }
}
