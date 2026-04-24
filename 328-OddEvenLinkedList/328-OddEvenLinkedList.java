// Last updated: 4/24/2026, 8:14:33 AM
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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode head2 = head.next;
        ListNode x = head, y = head2;
        while (y != null && y.next != null) {
            x.next = y.next;
            x = y.next;
            y.next = x.next;
            y = x.next;
        }
        x.next = head2;
        return head;
    }
}