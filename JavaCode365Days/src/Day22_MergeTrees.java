
// Day 22 - Merge two binary trees
// June 13th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 32ms Solution

public class Day22_MergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode ret;
        if (t1 == null){
            return t2;
        }
        else if (t2 == null){
            return t1;
        }
        else{
            ret = new TreeNode((t1.val + t2.val));
            ret.left = mergeTrees(t1.left, t2.left);
            ret.right = mergeTrees(t1.right, t2.right);
            return ret;
        }

    }

    public static void main(String[] args) {
        Day22_MergeTrees c = new Day22_MergeTrees();
    }
}

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
