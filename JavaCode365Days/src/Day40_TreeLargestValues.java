
// Day 40 - Return a list of max numbers at each level of a binary tree
// July 1st, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 10ms Solution

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Day40_TreeLargestValues {

    public List<Integer> largestValues(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();

        if (root == null) {
            return res;
        }

        if (root.left == null & root.right == null) {
            res.add(root.val);
            return res;
        }

        q.add(root);
        res.add(root.val);
        int levelNodes = 0;

        while (!q.isEmpty()) {
            levelNodes = q.size();
            int maxNum = Integer.MIN_VALUE;
            while (levelNodes > 0) {
                TreeNode n = (TreeNode) q.remove();
                if (n.left != null) {
                    q.add(n.left);
                    maxNum = maxNum >= n.left.val ? maxNum : n.left.val;
                }
                if (n.right != null) {
                    q.add(n.right);
                    maxNum = maxNum >= n.right.val ? maxNum : n.right.val;
                }
                levelNodes--;
            }
            res.add(maxNum);
        }
        res.remove(res.size() - 1);
        return res;
    }

    public static void main(String[] args) {
        Day40_TreeLargestValues c = new Day40_TreeLargestValues();
        TreeNode s4 = new TreeNode(1);
        s4.left = new TreeNode(3);
        s4.right = new TreeNode(2);
        s4.left.left = new TreeNode(5);
        s4.left.right = new TreeNode(3);
        s4.right.right = new TreeNode(9);
        System.out.println(c.largestValues(s4));
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
