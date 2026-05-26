// Last updated: 5/26/2026, 7:10:36 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int n = nums.length;
4        for (int i = 0; i < n - 1; ++i) {
5            if (nums[i] == 0) {
6                for (int j = i + 1; j < n; ++j) {
7                    if (nums[j] != 0) {
8                        nums[i] = nums[j];
9                        nums[j] = 0;
10                        break;
11                    }
12                }
13            }
14        }
15    }
16}