// Last updated: 5/29/2026, 8:48:16 AM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int a = m - 1;     // Pointer for nums1 valid elements
4        int b = n - 1;     // Pointer for nums2
5        int c = m + n - 1; // Pointer for insertion at the back of nums1
6
7        // Loop as long as there are elements to compare in both arrays
8        while (a >= 0 && b >= 0) {
9            if (nums1[a] > nums2[b]) {
10                nums1[c] = nums1[a];
11                a--;
12            } else {
13                nums1[c] = nums2[b];
14                b--;
15            }
16            c--;
17        }
18
19        // If nums2 still has remaining elements, copy them over.
20        // (If nums1 has remaining elements, they are already in their correct places!)
21        while (b >= 0) {
22            nums1[c] = nums2[b];
23            b--;
24            c--;
25        }
26    }
27}