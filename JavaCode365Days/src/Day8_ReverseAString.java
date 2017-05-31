
// Day 8 - Reverse a String 
// May 30th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n)

public class Day8_ReverseAString {
	 public String reverseString(String s) {
        	if (s != null && !s.isEmpty()){
        		StringBuilder sb = new StringBuilder(s);
        		return sb.reverse().toString(); 
        	}
        	else{
        		return s;
        	} 
    }

	public static void main(String[] args) {
		Day8_ReverseAString c = new Day8_ReverseAString();
		String s1 = "hello";
		System.out.println(c.reverseString(s1));
	}
}
