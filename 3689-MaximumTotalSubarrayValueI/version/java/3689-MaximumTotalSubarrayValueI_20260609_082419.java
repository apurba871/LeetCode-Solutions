// Last updated: 6/9/2026, 8:24:19 AM
1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3        long max = Arrays.stream(nums).max().getAsInt();
4        long min = Arrays.stream(nums).min().getAsInt();
5        return (max - min) * k;
6    }
7}