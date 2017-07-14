
// Day 51 - Return the right side view of a binary tree
// July 12th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(n), 3ms Solution

import java.util.*;

public class Day51_BTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        List<Integer> leftS = new ArrayList<>();

        if (root == null) return res;

        res.add(root.val);
        leftS.add(root.val);

        if (root.right != null) {
            for (int i : rightSideView(root.right)) {
                res.add(i);
            }
        }

        if (root.left != null) {
            for (int j : rightSideView(root.left)) {
                leftS.add(j);
            }
        }

        for (int k = 0; k < leftS.size(); k++) {
            if (k > res.size() - 1) res.add(leftS.get(k));
        }

        return res;

    }

    public static void main(String[] args) {
        Day51_BTreeRightSideView c = new Day51_BTreeRightSideView();
        TreeNode s4 = new TreeNode(1);
        s4.left = new TreeNode(2);
        s4.right = new TreeNode(3);
        s4.left.left = new TreeNode(4);
        s4.left.right = new TreeNode(5);
        // [1, 3, 5]
        System.out.println(c.rightSideView(s4).toString());
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
