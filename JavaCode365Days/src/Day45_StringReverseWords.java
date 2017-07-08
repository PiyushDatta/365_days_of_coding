
// Day 45 - Reverse the string word by word.
// July 6th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(n), 152ms Solution

import java.util.ArrayList;
import java.util.List;

public class Day45_StringReverseWords {

    public String reverseWords(String s) {
        String res = "";
        ArrayList<String> resArr = new ArrayList<>();
        if (s.equals("")) return s;
        if (s.trim().isEmpty()) return "";

        String temp = "";
        for (char i : s.toCharArray()) {
            if (i != ' ') {
                temp += i;
            } else {
                if (!temp.equals("")) {
                    resArr.add(temp);
                }
                temp = "";
            }
        }

        if (!temp.equals("")) {
            resArr.add(temp);
        }

        for (int j = resArr.size() - 1; j > -1; j--) {
            res += resArr.get(j);
            if (j - 1 != -1) {
                res += " ";
            }
        }

        return res;

    }

    public static void main(String[] args) {
        Day45_StringReverseWords c = new Day45_StringReverseWords();
        String s5 = "  a  b";
        System.out.print(c.reverseWords(s5));
    }
}
