// Last updated: 5/16/2026, 7:59:41 AM
1class Solution {
2    public int findMin(int[] nums) {
3        return Arrays.stream(nums).min().getAsInt();
4    }
5}