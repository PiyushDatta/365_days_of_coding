
// Day 6 - Divide (without using multiplication, modules, or division) 
// May 28th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(logn)

import java.lang.*;
public class Day6_divide {

	public int divide(int dividend, int divisor) {
		int kInt = 0;
		long numeratorNum = Math.abs((long)dividend);
		long denomNum = Math.abs((long)divisor);

		// Base cases
		if (dividend == divisor) return 1;

		if (divisor == 1) return dividend;

		if (dividend == Integer.MIN_VALUE && divisor == -1)
			return Integer.MAX_VALUE;

		if (dividend == Integer.MAX_VALUE && divisor == -1)
			return Integer.MIN_VALUE;
		
		// O(logn)
		while (numeratorNum >= denomNum) {
			int counter = 0;
			while (numeratorNum >= (denomNum << counter)) {
				counter++;
			}
			kInt = kInt + (1 << (counter-1));
			numeratorNum = numeratorNum - (denomNum << (counter-1));
		}
		// Same symbol? return positive kInt. Else, return
		// negative kInt.
		if ((dividend > 0 && divisor > 0) || 
			(dividend < 0 && divisor < 0)) 
			return kInt;
		else return -kInt;
	}

	public static void main(String[] args) {
		Day6_divide c = new Day6_divide();
		int dividend1 = 10;
		int divisor1 = 3;
		System.out.println(c.divide(dividend1, divisor1));
	}
}