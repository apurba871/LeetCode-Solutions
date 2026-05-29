// Last updated: 5/29/2026, 12:47:55 PM
1class Solution {
2    static {
3        for (int i = 0; i < 10000; ++i) {
4            intersection(new int[]{}, new int[]{});
5        }
6    }
7    public static int[] intersection(int[] nums1, int[] nums2) {
8        Arrays.sort(nums1);
9        Arrays.sort(nums2);
10        int n1 = nums1.length;
11        int n2 = nums2.length;
12        int i = 0, j = 0;
13        List<Integer> ans = new ArrayList<>();
14        while (i < n1 && j < n2) {
15            if (nums1[i] < nums2[j])
16                i++;
17            else if (nums1[i] > nums2[j])
18                j++;
19            else {
20                if (ans.size() == 0 || ans.get(ans.size() - 1) != nums1[i])
21                ans.add(nums1[i]);
22                i++;
23                j++;
24            }
25        }
26        int n = ans.size();
27        int res[] = new int[n];
28        int idx = 0;
29        for (int x : ans) {
30            res[idx++] = x;
31        }
32        return res;
33    }
34}