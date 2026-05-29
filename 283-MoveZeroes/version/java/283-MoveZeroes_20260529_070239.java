// Last updated: 5/29/2026, 7:02:39 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int j = -1;
4        int n = nums.length;
5        for (int i = 0; i < n; ++i) {
6            if (nums[i] == 0) {
7                j = i;
8                break;
9            }
10        }
11        for (int i = j + 1; i < n && j >= 0; ++i) {
12            if (nums[i] != 0) {
13                int temp = nums[i];
14                nums[i] = nums[j];
15                nums[j] = temp;
16                j++;
17            }
18        }
19    }
20}