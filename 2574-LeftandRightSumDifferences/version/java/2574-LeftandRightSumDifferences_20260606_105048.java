// Last updated: 6/6/2026, 10:50:48 AM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        int rightSum = 0;
6        for (int item : nums)
7            rightSum += item;
8        int leftSum = 0;
9        for (int i = 0; i < n; ++i) {
10            rightSum -= nums[i];
11            ans[i] = Math.abs(leftSum - rightSum);
12            leftSum += nums[i];
13        }
14        return ans;
15    }
16}