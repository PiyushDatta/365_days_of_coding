
// Day 55 - Switch every 2nd node with the one before it
// July 16th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(1), 4ms Solution

import java.util.*;

public class Day55_LinkedListSwapPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null) return head;

        if (head.next == null) return head;

        if (head.next.next == null) {
            ListNode curr = head.next;
            curr.next = head;
            head.next = null;
            return curr;
        }

        ListNode curr = head.next;
        ListNode prev = null;
        while (head.next != null && head.next.next != null) {
            ListNode nextH = head.next;
            ListNode lastH = head.next.next;
            nextH.next = head;
            if (prev != null) prev.next = nextH;
            head.next = lastH;
            prev = head;
            head = head.next;
        }

        if (head.next != null) {
            prev.next = head.next;
            head.next = null;
            prev.next.next = head;
        }

        return curr;
    }

    public static void main(String[] args) {
        Day55_LinkedListSwapPairs c = new Day55_LinkedListSwapPairs();
        ListNode s6 = new ListNode(1);
        s6.next = new ListNode(2);
        s6.next.next = new ListNode(3);
        ArrayList<Integer> test1 = new ArrayList<>();
        ListNode test2 = c.swapPairs(s6);
        while (test2 != null) {
            test1.add(test2.val);
            test2 = test2.next;
        }
        // [2, 1, 3]
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
