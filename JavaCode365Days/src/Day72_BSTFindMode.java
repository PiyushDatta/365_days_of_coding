
// Day 72 - Return int array of the mode(s) in the binary search tree
// August 2nd, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(n), 48ms Solution

import java.util.*;

public class Day72_BSTFindMode {

    public int[] findMode(TreeNode root) {

        if (root == null) return new int[0];

        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> ret = new HashMap<>();
        ArrayList<Integer> newRes = inOrderTraversal(root);

        for (int i : newRes) {
            if (ret.containsKey(i)) {
                ret.put(i, ret.get(i) + 1);
            } else {
                ret.put(i, 1);
            }
        }

        int max = Collections.max(ret.values());

        if (max == 1) {
            int[] result = new int[newRes.size()];
            for (int k = 0; k < newRes.size(); k++) {
                result[k] = newRes.get(k);
            }
            return result;
        }

        for (Map.Entry<Integer, Integer> entry : ret.entrySet()) {
            if (entry.getValue() == max) res.add(entry.getKey());
        }

        int[] result = new int[res.size()];

        for (int k = 0; k < res.size(); k++) {
            result[k] = res.get(k);
        }

        return result;
    }

    public ArrayList<Integer> inOrderTraversal(TreeNode root) {

        if (root == null) return null;

        ArrayList<Integer> res = new ArrayList<>();
        res.add(root.val);

        if (root.left != null) {
            for (int i : inOrderTraversal(root.left)) {
                res.add(i);
            }
        }

        if (root.right != null) {
            for (int j : inOrderTraversal(root.right)) {
                res.add(j);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Day72_BSTFindMode c = new Day72_BSTFindMode();

        TreeNode s5 = new TreeNode(10);
        s5.left = new TreeNode(5);
        s5.right = new TreeNode(7);
        s5.left.left = new TreeNode(4);
        s5.left.right = new TreeNode(15);
        s5.right.right = new TreeNode(6);
        s5.right.left = new TreeNode(3);

        System.out.println(Arrays.toString(c.findMode(s5)));
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
