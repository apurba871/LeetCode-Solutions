// Last updated: 6/15/2026, 7:42:29 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteMiddle(ListNode head) {
13        if (head.next == null)
14            return null;
15        ListNode slow = head, fast = head, prev = null;
16        while (fast != null && fast.next != null) {
17            prev = slow;
18            slow = slow.next;
19            fast = fast.next.next;
20        }
21        prev.next = slow.next;
22        slow.next = null;
23        return head;
24    }
25}