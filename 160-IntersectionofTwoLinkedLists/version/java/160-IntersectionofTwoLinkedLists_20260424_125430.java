// Last updated: 4/24/2026, 12:54:30 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    private int getLengthOfLL(ListNode head) {
14        ListNode temp = head;
15        int count = 0;
16        while (temp != null) {
17            count++;
18            temp = temp.next;
19        }
20        return count;
21    }
22    private ListNode findCollidingNode(ListNode headA, ListNode headB, int lenA, int lenB) {
23        ListNode tempA = headA, tempB = headB;
24        if (lenA > lenB) {
25            int d = lenA - lenB;
26            tempA = headA;
27            while (d-- > 0) {
28                tempA = tempA.next;
29            }
30        } else if (lenB > lenA) {
31            int d = lenB - lenA;
32            tempB = headB;
33            while (d-- > 0) {
34                tempB = tempB.next;
35            }
36        }
37        while (tempA != null) {
38            if (tempA == tempB)
39                return tempA;
40            tempA = tempA.next;
41            tempB = tempB.next;
42        }
43        return null;
44    }
45    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
46        int lenA = getLengthOfLL(headA);
47        int lenB = getLengthOfLL(headB);
48        ListNode collidingNode = findCollidingNode(headA, headB, lenA, lenB);
49        return collidingNode;
50    }
51}