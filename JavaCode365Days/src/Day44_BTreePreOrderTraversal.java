
// Day 44 - Return the preorder traversal of a binary tree
// July 5th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(n), 3ms Solution

import java.util.ArrayList;
import java.util.List;

public class Day44_BTreePreOrderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        // Pre-order is (root, left, right)
        if (root == null) {
            return res;
        }

        res.add(root.val);

        if (root.left != null) {
            for (int i : preorderTraversal(root.left)) {
                res.add(i);
            }
        }

        if (root.right != null) {
            for (int j : preorderTraversal(root.right)) {
                res.add(j);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Day44_BTreePreOrderTraversal c = new Day44_BTreePreOrderTraversal();
        TreeNode s4 = new TreeNode(1);
        s4.left = new TreeNode(2);
        s4.right = new TreeNode(3);
        s4.left.left = new TreeNode(4);
        s4.left.right = new TreeNode(5);
        s4.right.right = new TreeNode(9);
        // [1, 2, 4, 5, 3, 9]
        System.out.println(c.preorderTraversal(s4).toString());
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
