
// Day 28 - Delete duplicates from a sorter singly-linked list  
// June 19th, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(n), 4ms Solution

import java.util.ArrayList;

public class Day28_DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return null;
        }

        ArrayList<Integer> res = new ArrayList<Integer>();
        ListNode finRes = new ListNode(head.val);
        ListNode curr = finRes;

        while (head != null) {
            res.add(head.val);
            head = head.next;
        }

        for (int i : res) {
            if (i != finRes.val) {
                finRes.next = new ListNode(i);
                finRes = finRes.next;
            }
        }

        return curr;
    }

    public static void main(String[] args) {
        Day28_DeleteDuplicates c = new Day28_DeleteDuplicates();
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(2);
        System.out.print(c.deleteDuplicates(head1));

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