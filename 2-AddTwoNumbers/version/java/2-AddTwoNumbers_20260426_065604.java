// Last updated: 4/26/2026, 6:56:04 AM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode t1 = l1, t2 = l2;
14        ListNode t3 = null, temp = null;
15        int carry = 0;
16        while (t1 != null || t2 != null || carry == 1) {
17            int sum = 0;
18            if (t1 != null) {
19                sum += t1.val;
20                t1 = t1.next;
21            }
22            if (t2 != null) {
23                sum += t2.val;
24                t2 = t2.next;
25            }
26            sum += carry;
27            ListNode newNode = new ListNode(sum % 10);
28            newNode.next = null;
29            carry = sum / 10;
30            if (t3 == null)
31                t3 = newNode;
32            else
33                temp.next = newNode;
34            temp = newNode;
35        }
36        return t3;
37    }
38}