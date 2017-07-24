
// Day 63 - Remove singly-linked list nodes that equal to val
// July 24th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(1), 1ms Solution

import java.util.*;

public class Day63_LinkedListRemoveElements {

    public ListNode removeElements(ListNode head, int val) {
        
        if (head == null) return null;
        
        if (head.next == null){
            if (head.val == val) return null;
            else return head;
        }
        
        ListNode curr = head;

        while (head.val == val){
            if (head.next == null) return null;
            curr = curr.next;
            head = head.next;
        }

        ListNode prev = null;
        while (head != null){
            if (head.val == val){
                prev.next = head.next;
                head = prev.next;
            }else{
                prev = head; 
                head = head.next;
            }
        }

        return curr;
    }

    public static void main(String[] args) {
        Day63_LinkedListRemoveElements c = new Day63_LinkedListRemoveElements();
        ListNode s6 = new ListNode(1);
        s6.next = new ListNode(2);
        s6.next.next = new ListNode(6);
        s6.next.next.next = new ListNode(3);
        s6.next.next.next.next = new ListNode(4);
        s6.next.next.next.next.next = new ListNode(5);
        s6.next.next.next.next.next.next = new ListNode(6);
        s6.next.next.next.next.next.next.next = new ListNode(2);
        // [1, 2, 3, 4, 5, 2]
        ArrayList<Integer> test1 = new ArrayList<>();
        ListNode test2 = c.removeElements(s6, 6);
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
