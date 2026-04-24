// Last updated: 4/24/2026, 8:14:51 AM
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
    public ListNode mergeSortLL(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode middle = findMiddle(head);
        ListNode leftHead = head;
        ListNode rightHead = middle.next;
        middle.next = null;
        leftHead = mergeSortLL(leftHead);
        rightHead = mergeSortLL(rightHead);
        return mergeLL(leftHead, rightHead);
    }
    public ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode mergeLL(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }
        if (list1 != null)
            temp.next = list1;
        else
            temp.next = list2;
        return dummyNode.next;
    }
    public ListNode sortList(ListNode head) {
        return mergeSortLL(head);
    }
}