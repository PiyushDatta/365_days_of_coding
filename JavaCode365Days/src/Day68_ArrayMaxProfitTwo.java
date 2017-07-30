
// Day 68 - Return total profits if you can only sell or buy each day
// July 29th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(1), 2ms Solution

import java.util.*;

public class Day68_ArrayMaxProfitTwo {

    public int maxProfit(int[] prices) {

        int count = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (i + 1 <= prices.length - 1) {
                if (prices[i + 1] > prices[i])
                    count += prices[i + 1] - prices[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Day68_ArrayMaxProfitTwo c = new Day68_ArrayMaxProfitTwo();
        int[] s1 = {1, 2, 3, 4, 5, 2, 1, 5};
        // 8
        System.out.println(c.maxProfit(s1));

    }
}
