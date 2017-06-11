
// Day 19 - Reverse a singly-linked list
// June 10th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 2ms solution

import java.util.ArrayList;

public class Day19_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } 

        else {

            ArrayList<Integer> ArrayHead = new ArrayList<>();
            int count = 0;

            while (head.next != null) {
                ArrayHead.add(head.val);
                head = head.next;
            }

            ListNode revNode = new ListNode(head.val);
            ListNode curr = revNode;

            for (int i = ArrayHead.size() - 1; i > -1; i--) {
                revNode.next = new ListNode(ArrayHead.get(i));
                revNode = revNode.next;
            }

            return curr;
        }
    }

    public static void main(String[] args) {
        Day19_ReverseLinkedList c = new Day19_ReverseLinkedList();
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(4);

        System.out.println(c.reverseList(node1).val);
        System.out.println(c.reverseList(node1).next.val);
        System.out.println(c.reverseList(node1).next.next.val);
        System.out.println(c.reverseList(node1).next.next.next.val);
        // Should return 4->3->2->1
    }
}


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

