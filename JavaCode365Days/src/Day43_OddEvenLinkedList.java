
// Day 43 - Mutate the singly-linked list so that every even index is at the end of the list
// July 4th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(1), 3ms Solution

import java.util.ArrayList;

public class Day43_OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer> res = new ArrayList<>();
        int counter = 1;
        ListNode curr = head;

        if (head == null || head.next == null) {
            return head;
        }

        while (head.next != null) {
            if ((counter + 1) % 2 == 0) {
                res.add(head.next.val);
                head.next = head.next.next;
                counter++;
            } else {
                head = head.next;
                counter++;
            }
        }

        head.next = new ListNode(res.get(0));
        head = head.next;

        for (int i = 1; i < res.size(); i++) {
            head.next = new ListNode(res.get(i));
            head = head.next;
        }

        return curr;
    }


    public static void main(String[] args) {
        Day43_OddEvenLinkedList c = new Day43_OddEvenLinkedList();
        ListNode s6 = new ListNode(1);
        s6.next = new ListNode(2);
        s6.next.next = new ListNode(3);
        s6.next.next.next = new ListNode(4);
        s6.next.next.next.next = new ListNode(5);
        s6.next.next.next.next.next = new ListNode(6);
        s6.next.next.next.next.next.next = new ListNode(7);
        s6.next.next.next.next.next.next.next = new ListNode(8);
        // Ans is [1, 3, 5, 7, 2, 4, 6, 8]
        ArrayList<Integer> test1 = new ArrayList<>();
        ListNode test2 = c.oddEvenList(s6);
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
