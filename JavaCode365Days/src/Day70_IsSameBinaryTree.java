
// Day 70 - Return true if both binary trees are exactly the same
// July 31st, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(1), 0ms Solution

import java.util.*;

public class Day70_IsSameBinaryTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if (p == null && q == null) return true;
        if (p == null && q != null) return false;
        if (p != null && q == null) return false;
        if (p.val != q.val) return false;

        if (!isSameTree(p.left, q.left)) return false;
        if (!isSameTree(p.right, q.right)) return false;

        return true;
    }

    public static void main(String[] args) {
        Day70_IsSameBinaryTree c = new Day70_IsSameBinaryTree();
        
        TreeNode s4 = new TreeNode(10);
        s4.left = new TreeNode(5);

        TreeNode s5 = new TreeNode(10);
        s5.left = new TreeNode(5);

        // true
        System.out.println(c.isSameTree(s4, s5));
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

