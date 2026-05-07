// Last updated: 5/8/2026, 12:58:16 AM
1class Solution {
2    public int[] maxValue(int[] nums) {
3        int n = nums.length;
4
5        int[] prefMax = new int[n];
6        int[] suffMin = new int[n];
7
8        prefMax[0] = nums[0];
9        for (int i = 1; i < n; i++) {
10            prefMax[i] = Math.max(prefMax[i - 1], nums[i]);
11        }
12
13        suffMin[n - 1] = nums[n - 1];
14        for (int i = n - 2; i >= 0; i--) {
15            suffMin[i] = Math.min(suffMin[i + 1], nums[i]);
16        }
17
18        int[] ans = new int[n];
19
20        int start = 0;
21        int segmentMax = nums[0];
22
23        for (int i = 0; i < n; i++) {
24            segmentMax = Math.max(segmentMax, nums[i]);
25
26            boolean cut = (i == n - 1) || (prefMax[i] <= suffMin[i + 1]);
27
28            if (cut) {
29                for (int j = start; j <= i; j++) {
30                    ans[j] = segmentMax;
31                }
32
33                start = i + 1;
34
35                if (start < n) {
36                    segmentMax = nums[start];
37                }
38            }
39        }
40
41        return ans;
42    }
43}