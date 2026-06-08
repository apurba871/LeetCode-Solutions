// Last updated: 6/8/2026, 5:42:56 AM
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        int idx = -1;
6        int count = 0;
7        for (int i = 0; i < n; ++i) {
8            int item = nums[i];
9            if (item < pivot) {
10                ans[++idx] = item;
11                nums[i] = Integer.MIN_VALUE;
12            }
13            if (item == pivot) {
14                count++;
15                nums[i] = Integer.MIN_VALUE;
16            }
17        }
18        for (int i = 0; i < count; ++i)
19            ans[++idx] = pivot;
20        for (int i = 0; i < n; ++i) {
21            if (nums[i] != Integer.MIN_VALUE)
22                ans[++idx] = nums[i];
23        }
24        return ans;
25    }
26}