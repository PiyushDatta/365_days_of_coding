
// Day 64 - Reverse nodes at node place m to node place n
// July 25th, 2017
// Leetcode.com
// Under algorithms section
// Big O: Time complexity: O(n), Space complexity: O(1), 4ms Solution

import java.util.*;

public class Day64_LinkedListReverseBetween {

    public ListNode reverseBetween(ListNode head, int m, int n){
        if (head == null || head.next == null) return head;

        if (m == n) return head;

        else{

            int count = 1;
            ListNode firstNode = head;
            ListNode prevHead = null;
            while (count != m){
                count++;
                prevHead = head;
                head = head.next;
            }

            ListNode revHead = head;
            while (count != n){
                count++;
                if (revHead == null || revHead.next == null){
                    if (m == 1) return reverseLL(firstNode);
                    else{
                        prevHead.next = reverseLL(head);
                        return firstNode;
                    }
                }
                revHead = revHead.next;
            }

            ListNode afterRev = revHead.next;
            
            if (m == 1){
                revHead.next = null;
                ListNode curr = reverseLL(head);
                ListNode res = curr;
                
                while (curr.next != null){
                    curr = curr.next;
                }
                
                curr.next = afterRev;
                return res;
            }

            revHead.next = null;
            ListNode curr = firstNode;
            if (prevHead != null){
                prevHead.next = reverseLL(head);
                while (prevHead.next != null){
                    prevHead = prevHead.next;
                }

                prevHead.next = afterRev;
            }

            return curr;
        }
    }

    public ListNode reverseLL(ListNode head){
        
        if (head == null || head.next == null) return head;

        ListNode curr = head;
        ListNode prev = null;
        ListNode nextNode = null;

        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }

    public static void main(String[] args) {
        Day64_LinkedListReverseBetween c = new Day64_LinkedListReverseBetween();
        ListNode s6 = new ListNode(1);
        s6.next = new ListNode(2);
        s6.next.next = new ListNode(3);
        s6.next.next.next = new ListNode(4);
        s6.next.next.next.next = new ListNode(5);
        s6.next.next.next.next.next = new ListNode(6);
        s6.next.next.next.next.next.next = new ListNode(7);
        s6.next.next.next.next.next.next.next = new ListNode(8);
//         [1, 7, 6, 5, 4, 3, 2, 8]
        ArrayList<Integer> test1 = new ArrayList<>();
        ListNode test2 = c.reverseBetween(s6, 2, 7);
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
