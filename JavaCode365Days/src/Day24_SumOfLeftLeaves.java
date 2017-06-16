
// Day 24 - Find the value of all left nodes at the lowest depth of tree
// June 15th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 8ms Solution

public class Day24_SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int res = 0;
        if (root == null) {
            return 0;
        } else {
            if (root.left != null && root.left.left == null && root.left.right == null){
                res += root.left.val;
            }
            res += sumOfLeftLeaves(root.left);
            res += sumOfLeftLeaves(root.right);
        }

        return res;
    }

    public static void main(String[] args) {
        Day24_SumOfLeftLeaves c = new Day24_SumOfLeftLeaves();
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        System.out.println(c.sumOfLeftLeaves(root1));
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
