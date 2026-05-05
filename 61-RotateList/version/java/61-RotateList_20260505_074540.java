// Last updated: 5/5/2026, 7:45:40 AM
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
12    public int countNodes(ListNode head) {
13        ListNode temp = head;
14        int count = 0;
15        while (temp != null) {
16            count++;
17            temp = temp.next;
18        }
19        return count;
20    }
21    public ListNode rotate(ListNode head) {
22        ListNode temp = head;
23        while (temp.next.next != null) {
24            temp = temp.next;
25        }
26        ListNode lastNode = temp.next;
27        temp.next = null;
28        lastNode.next = head;
29        head = lastNode;
30        return head;
31    }
32    public ListNode rotateRight(ListNode head, int k) {
33        int numNodes = countNodes(head);
34        if (k == 0)
35            return head;
36        if (numNodes > 0)
37            k = k % numNodes;
38        for (int i = 0; i < k && numNodes > 0; ++i) {
39            head = rotate(head);
40        }
41        return head;
42    }
43}