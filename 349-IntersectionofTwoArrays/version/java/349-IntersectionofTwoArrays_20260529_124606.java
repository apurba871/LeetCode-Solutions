// Last updated: 5/29/2026, 12:46:06 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Arrays.sort(nums1);
4        Arrays.sort(nums2);
5        int n1 = nums1.length;
6        int n2 = nums2.length;
7        int i = 0, j = 0;
8        List<Integer> ans = new ArrayList<>();
9        while (i < n1 && j < n2) {
10            if (nums1[i] < nums2[j])
11                i++;
12            else if (nums1[i] > nums2[j])
13                j++;
14            else {
15                if (ans.size() == 0 || ans.get(ans.size() - 1) != nums1[i])
16                ans.add(nums1[i]);
17                i++;
18                j++;
19            }
20        }
21        int n = ans.size();
22        int res[] = new int[n];
23        int idx = 0;
24        for (int x : ans) {
25            res[idx++] = x;
26        }
27        return res;
28    }
29}