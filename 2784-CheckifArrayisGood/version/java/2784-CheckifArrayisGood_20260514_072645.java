// Last updated: 5/14/2026, 7:26:45 AM
1class Solution {
2    public boolean isGood(int[] nums) {
3        int max = Arrays.stream(nums).max().getAsInt();
4        if (nums.length != max + 1)
5            return false;
6        Arrays.sort(nums);
7        if (nums[nums.length - 1] != max)
8            return false;
9        int val = 1;
10        for (int i = 0; i < nums.length - 1; ++i) {
11            if (val++ != nums[i])
12                return false;
13        }
14        return true;
15    }
16}