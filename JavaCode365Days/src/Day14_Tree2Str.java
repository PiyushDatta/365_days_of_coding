
// Day 14 - Find the string of the preorder reversal
// June 5th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n)
// Using the Day12_Day12_TreeNodeForTiltForTilt class for the Day12_TreeNodeForTilt code

public class Day14_Tree2Str {

    public String tree2str(Day12_TreeNodeForTilt t) {

        if (t == null) {
            return "";
        } else {

            String rootStr = Integer.toString(t.val);
            String leftStr = tree2str(t.left);
            String rightStr = tree2str(t.right);

            if (t.left == null && t.right == null) {
                return rootStr;
                
            } else if (rightStr == "") {
                return rootStr + "(" + leftStr + ")";
                
            } else if (leftStr == "") {
                return rootStr + "(" + ")" + "(" + rightStr + ")";
            }

            return rootStr + "(" + leftStr + ")" + "(" + rightStr + ")";
        }
    }

    public static void main(String[] args) {
        Day14_Tree2Str c = new Day14_Tree2Str();
        Day12_TreeNodeForTilt root1 = new Day12_TreeNodeForTilt(1);
        root1.left = new Day12_TreeNodeForTilt(2);
//        root1.left.left = new Day12_Day12_TreeNodeForTiltForTilt(5);
        root1.left.right = new Day12_TreeNodeForTilt(4);
        root1.right = new Day12_TreeNodeForTilt(3);
//		root1.right.left = new Day12_TreeNodeForTilt(4);
//		root1.right.right = new Day12_TreeNodeForTilt(5);
//        root1.right.right.right = new Day12_Day12_TreeNodeForTiltForTilt(3);
        System.out.println(c.tree2str(root1));
        // Should output 1(2()(4))(3)

    }
}
