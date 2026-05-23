// Last updated: 5/23/2026, 8:05:31 PM
1class Solution {
2    public int minimumSwaps(int[] nums) {
3        int z = 0;
4        for (int i : nums) {
5            if (i == 0) z++;
6        }
7        int n = nums.length;
8        int ans = 0;
9        for (int i = n - 1; i >= 0 && z-- > 0; --i) {
10            if (nums[i] != 0)
11                ans++;
12        }
13        return ans;
14    }
15}