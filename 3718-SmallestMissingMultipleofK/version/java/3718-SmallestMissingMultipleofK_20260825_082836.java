// Last updated: 8/25/2026, 8:28:36 AM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        for (int i = 1;; ++i) {
4            int mult = k * i;
5            boolean flag = false;
6            for (int j = 0; j < nums.length; ++j) {
7                if (nums[j] == mult) {
8                    flag = true;
9                    break;
10                }
11            }
12            if (flag == false)
13                return mult;
14        }
15    }
16}