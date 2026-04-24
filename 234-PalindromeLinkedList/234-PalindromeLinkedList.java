// Last updated: 4/24/2026, 8:14:40 AM
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
    public boolean isPalindrome(ListNode head) {
        if (head.next == null)
            return true;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverse(slow.next);
        //print(newHead);
        ListNode first = head, second = newHead;
        while (second != null) {
            if (first.val != second.val)
                return false;
            first = first.next;
            second = second.next;
        }
        reverse(newHead);
        return true;
    }
    public static ListNode reverse(ListNode head) {
        if (head.next == null)
            return head;
        ListNode newHead = reverse(head.next);
        ListNode temp = head.next;
        temp.next = head;
        head.next = null;
        return newHead;
    }
    public static void print(ListNode head) {
        ListNode temp = head;
        System.out.println("Linked list: ");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}