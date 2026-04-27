// Last updated: 4/27/2026, 6:43:15 AM
1class Solution {
2    public long minOperations(int[] nums) {
3        long sum = 0;
4        for (int i = 0; i < nums.length - 1; ++i) {
5            if (nums[i] > nums[i + 1])
6                sum += nums[i] - nums[i + 1];
7        }
8        return sum;
9    }
10}