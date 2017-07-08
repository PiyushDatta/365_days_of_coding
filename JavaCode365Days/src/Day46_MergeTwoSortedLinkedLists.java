
// Day 46 - Merge two sorted singly-linked lists
// July 7th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(1), 14ms Solution

import java.util.ArrayList;

public class Day46_MergeTwoSortedLinkedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        int firstNode = 0;

        if (l1.val < l2.val) {
            firstNode = l1.val;
            l1 = l1.next;
        } else {
            firstNode = l2.val;
            l2 = l2.next;
        }

        ListNode l3 = new ListNode(firstNode);
        ListNode curr = l3;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val || l2 == null) {
                l3.next = new ListNode(l1.val);
                l3 = l3.next;
                l1 = l1.next;
            } else {
                l3.next = new ListNode(l2.val);
                l3 = l3.next;
                l2 = l2.next;
            }
        }

        if (l1 != null) {
            while (l1.next != null) {
                l3.next = new ListNode(l1.val);
                l3 = l3.next;
                l1 = l1.next;
            }
            l3.next = new ListNode(l1.val);
        }

        if (l2 != null) {
            while (l2.next != null) {
                l3.next = new ListNode(l2.val);
                l3 = l3.next;
                l2 = l2.next;
            }
            l3.next = new ListNode(l2.val);
        }

        return curr;
    }

    public static void main(String[] args) {
        Day46_MergeTwoSortedLinkedLists c = new Day46_MergeTwoSortedLinkedLists();
        ListNode s6 = new ListNode(1);
        s6.next = new ListNode(2);
        s6.next.next = new ListNode(3);
        ListNode s7 = new ListNode(3);
        s7.next = new ListNode(4);
        s7.next.next = new ListNode(5);
        ArrayList<Integer> test1 = new ArrayList<>();
        ListNode test2 = c.mergeTwoLists(s6, s7);
        while (test2 != null) {
         test1.add(test2.val);
         test2 = test2.next;
        }
        // [1, 2, 3, 3, 4, 5]
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
