
// Day 22 - Reverse multiple words in a sentence, and return the same sentence back with the reversed
// words in the same order.
// June 13th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n**2), 290ms Solution

public class Day22_ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        String[] revWords = new String[words.length];
        String res = "";

        for (int i = 0; i<words.length; i++){
            revWords[i] = new StringBuilder(words[i]).reverse().toString();
        }

        for (String i: revWords){
            res += " " + i;
        }

        return res.trim();
    }

    public static void main(String[] args) {
        Day22_ReverseWords c = new Day22_ReverseWords();
        String s1 = "Let's take LeetCode contest";
        System.out.println(c.reverseWords(s1));
    }
}

