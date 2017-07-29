
// Day 67 - Return 0 or if exists, the length of the last word
// July 28th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(n), 17ms Solution

import java.util.*;

public class Day67_StringLengthOfLastWord {

    public int lengthOfLastWord(String s) {

        String[] words = s.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }

        if (words.length == 0) return 0;
        return words[words.length - 1].toCharArray().length;
    }

    public static void main(String[] args) {
        Day67_StringLengthOfLastWord c = new Day67_StringLengthOfLastWord();
        String s1 = "Hello World";
        // 5
        System.out.println(c.lengthOfLastWord(s1));
    }
}
