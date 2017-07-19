
// Day 60 - Remove the nth node from the end of a singly-linked list
// July 21st, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(logn), Space complexity: O(1), 16ms Solution

import java.util.*;

public class Day60_LinkedListRemoveNthNodeFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) return null;

        ListNode curr = head;
        int count = 0;

        while (curr != null) {
            curr = curr.next;
            count++;
        }

        if (count == n && head.next == null) return null;
        if (count == n) return head.next;

        ListNode res = head;

        while (head != null) {
            if (count - 1 == n) {
                if (head == res) {
                    if (head.next.next != null) head.next = head.next.next;
                    else head.next = null;
                    return res;
                }
                head.next = head.next.next;
                return res;
            }
            head = head.next;
            count--;
        }

        return res;
    }

    public static void main(String[] args) {
        Day60_LinkedListRemoveNthNodeFromEnd c = new Day60_LinkedListRemoveNthNodeFromEnd();
        ListNode s6 = new ListNode(1);
        s6.next = new ListNode(2);
        s6.next.next = new ListNode(3);
        s6.next.next.next = new ListNode(4);
        s6.next.next.next.next = new ListNode(5);
        s6.next.next.next.next.next = new ListNode(6);
        s6.next.next.next.next.next.next = new ListNode(7);
        s6.next.next.next.next.next.next.next = new ListNode(8);
//         [1, 2, 3, 4, 5, 6, 8]
        ArrayList<Integer> test1 = new ArrayList<>();
        ListNode test2 = c.removeNthFromEnd(s6, 2);
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
