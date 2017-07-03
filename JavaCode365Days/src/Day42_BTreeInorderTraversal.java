
// Day 42 - Return the inorder traversal of a binary tree
// July 3rd, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 1ms Solution

import java.util.ArrayList;
import java.util.List;

public class Day42_BTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        // Inorder is (Left, Root, Right)
        ArrayList<Integer> res = new ArrayList<>();

        if (root == null){
            return res;
        }

        if (root.left != null) {
            for (int i : inorderTraversal(root.left)) {
                res.add(i);
            }
        }

        res.add(root.val);

        if (root.right != null) {
            for (int i : inorderTraversal(root.right)) {
                res.add(i);
            }
        }

        return res;
    }


    public static void main(String[] args) {
        Day42_BTreeInorderTraversal c = new Day42_BTreeInorderTraversal();
        TreeNode s4 = new TreeNode(1);
        s4.left = new TreeNode(2);
        s4.right = new TreeNode(3);
        s4.left.left = new TreeNode(4);
        s4.left.right = new TreeNode(5);
        // [4, 2, 5, 1, 3]
        System.out.println(c.inorderTraversal(s4));
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
