
// Day 11 - Find the maximum depth of a binary tree
// June 2nd, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n)

public class Day11_maxDepth {

 //  Definition for a binary tree node.
 //  public class TreeNode {
 //    int val;
 //    TreeNode left;
 //    TreeNode right;
 //    TreeNode(int x) { val = x; }
 // }
 
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int count = 1;
            int left_count = maxDepth(root.left) + count;
            int right_count = maxDepth(root.right) + count;
            return Math.max(left_count, right_count);
        }
    }

    public static void main(String[] args) {
        Day11_maxDepth c = new Day11_maxDepth();
        
//        TreeNode root1 = new TreeNode(10);
//        root1.left = new TreeNode(7);
//        root1.left.left = new TreeNode(5);
//        root1.left.right = new TreeNode(8);
//        root1.right = new TreeNode(12);
//        root1.right.left = new TreeNode(11);
//        root1.right.right = new TreeNode(14);
//        root1.right.right.right = new TreeNode(16);
//        System.out.println(c.maxDepth(root1));

    }
}
