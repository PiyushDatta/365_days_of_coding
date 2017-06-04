
// Day 12 - Find the tilt of the tree node
// June 3rd, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n)

public class Day12_BinaryTreeTilt {

    int tilt = 0;

    public int sumTree(Day12_TreeNodeForTilt root) {
        if (root == null) return 0;
        else {
            int leftSum = sumTree(root.left);
            int rightSum = sumTree(root.right);
            tilt += Math.abs(leftSum - rightSum);      
            return leftSum + rightSum + root.val;
        }
    }

    public int findTilt(Day12_TreeNodeForTilt root) {
        sumTree(root);
        return tilt;
    }

    public static void main(String[] args) {
        Day12_BinaryTreeTilt c = new Day12_BinaryTreeTilt();
        Day12_TreeNodeForTilt root1 = new Day12_TreeNodeForTilt(1);
        root1.left = new Day12_TreeNodeForTilt(2);
//        root1.left.left = new Day12_TreeNodeForTilt(5);
//        root1.left.right = new Day12_TreeNodeForTilt(8);
        root1.right = new Day12_TreeNodeForTilt(3);
        root1.right.left = new Day12_TreeNodeForTilt(4);
        root1.right.right = new Day12_TreeNodeForTilt(5);
//        root1.right.right.right = new Day12_TreeNodeForTilt(3);
        System.out.println(c.findTilt(root1));
        // Should output 11

    }
}
