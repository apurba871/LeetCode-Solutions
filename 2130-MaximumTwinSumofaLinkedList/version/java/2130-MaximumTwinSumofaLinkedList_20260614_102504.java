// Last updated: 6/14/2026, 10:25:04 AM
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
12    public int pairSum(ListNode head) {
13        ListNode slow = head;
14        ListNode fast = head;
15        List<Integer> firstHalf = new ArrayList<>();
16        // firstHalf.add(head.val);
17        while (fast != null) {
18            firstHalf.add(slow.val);
19            slow = slow.next;
20            fast = fast.next.next;
21        }
22        Collections.reverse(firstHalf);
23        int max = Integer.MIN_VALUE;
24        int i = 0;
25        while (slow != null) {
26            max = Math.max(max, firstHalf.get(i) + slow.val);
27            i++;
28            slow = slow.next;
29        }
30        return max;
31    }
32}