
// Day 22 - Distribute candies to the sister, and see how many unique
// candies she can get
// June 13th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 78ms Solution

import java.util.HashSet;

public class Day22_DistributeCandies {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> uniqueCand = new HashSet<>();
        int uniqueSis = 0;
        int distSize = candies.length / 2;

        for (int i : candies) {
            uniqueCand.add(i);
        }

        for (int i = 1; i <= uniqueCand.size(); i++) {
            if (i == distSize) {
                return i;
            }
            uniqueSis += 1;
        }

        return uniqueSis;
    }

    public static void main(String[] args) {
        Day22_DistributeCandies c = new Day22_DistributeCandies();
        int[] candies1 = {1,1,2,2,3,3};
        System.out.println(c.distributeCandies(candies1));   
    }
}

