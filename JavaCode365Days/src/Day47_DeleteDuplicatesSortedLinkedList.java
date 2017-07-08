
// Day 47 - Delete duplicates in a sorted singly-linked list
// July 8th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(n), 1ms Solution

import java.util.ArrayList;

public class Day47_DeleteDuplicatesSortedLinkedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode nextH = head.next;
        if (head.val == nextH.val) {
            while (head.val == nextH.val) {
                if (nextH.next == null) return null;
                head = nextH;
                nextH = nextH.next;
            }
            head = nextH;
        }
        if (head.next != null && head.next.val == head.val) return deleteDuplicates(head);
        ListNode curr = head;
        head.next = head.next != null ? deleteDuplicates(head.next) : null;
        return curr;
    }

    public static void main(String[] args) {
        Day47_DeleteDuplicatesSortedLinkedList c = new Day47_DeleteDuplicatesSortedLinkedList();
        ListNode s6 = new ListNode(1);
        s6.next = new ListNode(2);
        s6.next.next = new ListNode(2);
        s6.next.next.next = new ListNode(2);
        s6.next.next.next.next = new ListNode(4);
        s6.next.next.next.next.next = new ListNode(4);
        ArrayList<Integer> test1 = new ArrayList<>();
        ListNode test2 = c.deleteDuplicates(s6);
        while (test2 != null) {
            test1.add(test2.val);
            test2 = test2.next;
        }
        // [1]
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
