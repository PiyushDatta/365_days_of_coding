
// Day 58 - Given a linked list, reverse the 
// nodes of a linked list k at a time and return its modified list.
// July 19th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(1), 7ms Solution

import java.util.*;

public class Day58_ReverseNodesKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {

        int p = 1;

        if (head == null) return null;

        if (head.next == null) return head;

        if (k <= 1) return head;

        ListNode curr = head;

        while (p < k) {
            if (head.next == null) {
                return curr;
            }
            head = head.next;
            p++;
        }

        if (head.next == null) {
            return allNodes(curr);
        }

        ListNode temp = head.next;
        head.next = null;
        curr = allNodes(curr);
        ListNode firstN = curr;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = reverseKGroup(temp, k);
        return firstN;
    }

    public ListNode allNodes(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;
        ListNode nextNode = null;

        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        head = prev;
        return head;
    }

    public static void main(String[] args) {
        Day58_ReverseNodesKGroup c = new Day58_ReverseNodesKGroup();
        ListNode s6 = new ListNode(1);
        s6.next = new ListNode(2);
        s6.next.next = new ListNode(3);
        s6.next.next.next = new ListNode(4);
        s6.next.next.next.next = new ListNode(5);
        s6.next.next.next.next.next = new ListNode(6);
        s6.next.next.next.next.next.next = new ListNode(7);
        s6.next.next.next.next.next.next.next = new ListNode(8);
//         [1, 3, 5, 7, 2, 4, 6, 8]
        ArrayList<Integer> test1 = new ArrayList<>();
        ListNode test2 = c.reverseKGroup(s6, 3);
        while (test2 != null) {
            test1.add(test2.val);
            test2 = test2.next;
        }
        System.out.println(test1.toString());
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
