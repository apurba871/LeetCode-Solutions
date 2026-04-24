// Last updated: 4/24/2026, 9:25:16 AM
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
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        Map<ListNode, Integer> map = new HashMap<>();
15        ListNode temp = headA;
16        while (temp != null) {
17            map.put(temp, 1);
18            temp = temp.next;
19        }
20        temp = headB;
21        while (temp != null) {
22            if (map.containsKey(temp))
23                return temp;
24            temp = temp.next;
25        }
26        return null;
27    }
28}