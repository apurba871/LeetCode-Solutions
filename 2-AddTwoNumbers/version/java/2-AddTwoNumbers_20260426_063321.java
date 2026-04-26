// Last updated: 4/26/2026, 6:33:21 AM
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
16        while (t1 != null && t2 != null) {
17            int sum = t1.val + t2.val + carry;
18            ListNode newNode = null;
19            if (sum < 10) {
20                newNode = new ListNode(sum);
21                carry = 0;
22            } else {
23                newNode = new ListNode(sum % 10);
24                carry = 1;
25            }
26            newNode.next = null;
27            if (t3 == null)
28                t3 = newNode;
29            else
30                temp.next = newNode;
31            temp = newNode;
32            t1 = t1.next;
33            t2 = t2.next;
34        }
35        while (t1 != null) {
36            int sum = t1.val + carry;
37            ListNode newNode = null;
38            if (sum < 10) {
39                newNode = new ListNode(sum);
40                carry = 0;
41            } else {
42                newNode = new ListNode(sum % 10);
43                carry = 1;
44            }
45            newNode.next = null;
46            if (t3 == null)
47                t3 = newNode;
48            else
49                temp.next = newNode;
50            temp = newNode;
51            t1 = t1.next;
52        }
53        while (t2 != null) {
54            int sum = t2.val + carry;
55            ListNode newNode = null;
56            if (sum < 10) {
57                newNode = new ListNode(sum);
58                carry = 0;
59            } else {
60                newNode = new ListNode(sum % 10);
61                carry = 1;
62            }
63            newNode.next = null;
64            if (t3 == null)
65                t3 = newNode;
66            else
67                temp.next = newNode;
68            temp = newNode;
69            t2 = t2.next;
70        }
71        if (carry == 1) {
72            ListNode newNode = new ListNode(1);
73            newNode.next = null;
74            temp.next = newNode;
75        }
76        return t3;
77    }
78}