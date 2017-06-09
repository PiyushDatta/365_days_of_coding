
// Day 17 - Detect if the right use of capital letters is being used.
// Acceptable ways are, used in all chars, no chars, or only the first char
// June 8th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n)

import java.util.ArrayList;

public class Day17_DetectCapital {

    public boolean detectCapitalUse(String word) {

        char[] wordChar = word.toCharArray();
        ArrayList<Character> lowerChar = new ArrayList<Character>();
        ArrayList<Character> upperChar = new ArrayList<Character>();

        for (int i = 0; i < wordChar.length; i++) {
            if (wordChar[i] == Character.toUpperCase(wordChar[i])) {
                upperChar.add(wordChar[i]);
            } else {
                lowerChar.add(wordChar[i]);
            }
        }

        if (lowerChar.size() == wordChar.length || 
            upperChar.size() == wordChar.length) {
            return true;
        }

        if (upperChar.get(0) == wordChar[0] && 
            lowerChar.size() == wordChar.length - 1) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        Day17_DetectCapital c = new Day17_DetectCapital();
        String word1 = "Flag";
        System.out.println(c.detectCapitalUse(word1));
        // Should output True

    }
}