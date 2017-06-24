
// Day 32 - Determine if singly-linked list has a cycle
// June 23rd, 2017
// Leetcode.com
// Under algorithms section
// Big O: O(1), 1ms Solution

public class Day32_HasCycle {

    public boolean hasCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;

        while (first != null && first.next != null) {

            if (first.next == head) {
                return true;
            }

            first = first.next;
            second.next = head;
            second = first;
        }
        return false;
    }

    public static void main(String[] args) {
        Day32_HasCycle c = new Day32_HasCycle();
        ListNode r1 = new ListNode(3);
        r1.next = new ListNode(2);
        r1.next.next = new ListNode(2);
        r1.next.next.next = r1.next;
        System.out.println(c.hasCycle(r1));

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
