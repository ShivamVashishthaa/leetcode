/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode l1head = l1;
        ListNode l2head = l2;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1head != null || l2head != null || carry != 0) {
            int val1 = (l1head != null) ? l1head.val : 0;
            int val2 = (l2head != null) ? l2head.val : 0;

            int total = val1 + val2 + carry;
            carry = total / 10;
            int digit = total % 10;

            current.next = new ListNode(digit);
            current = current.next;

            if (l1head != null) l1head = l1head.next;
            if (l2head != null) l2head = l2head.next;
        }

        return dummy.next;
    }
}