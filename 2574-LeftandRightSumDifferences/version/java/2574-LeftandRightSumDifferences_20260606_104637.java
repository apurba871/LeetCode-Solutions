// Last updated: 6/6/2026, 10:46:37 AM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        for (int i = 0; i < n; ++i) {
6            int leftSum = 0;
7            for (int j = i - 1; j >= 0; --j) {
8                leftSum += nums[j];
9            }
10            int rightSum = 0;
11            for (int j = i + 1; j < n; ++j) {
12                rightSum += nums[j];
13            }
14            ans[i] = Math.abs(leftSum - rightSum);
15        }
16        return ans;
17    }
18}