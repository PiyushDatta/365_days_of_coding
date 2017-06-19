
// Day 27 - Delete a node on a singly-linked list (except the tail) 
// June 18th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(1), 1ms Solution

public class Day27_DeleteNode {
    public void deleteNode(ListNode node) {
        if (node.next != null){
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    public static void main(String[] args) {
        Day27_DeleteNode c = new Day27_DeleteNode();
        ListNode root1 = new ListNode(2);
        root1.next = new ListNode(5);
        root1.next.next = new ListNode(4);
        root1.next.next.next = new ListNode(7);
        c.deleteNode(root1.next.next);
        System.out.println(root1.next.next.val);
    }
}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
