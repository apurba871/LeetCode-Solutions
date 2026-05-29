// Last updated: 5/29/2026, 6:07:24 AM
1class Solution {
2    public int minElement(int[] nums) {
3        int ans = Integer.MAX_VALUE;
4        for (int i : nums) {
5            int sum = 0;
6            while (i > 0) {
7                sum += i % 10;
8                i /= 10;
9            }
10            ans = Math.min(ans, sum);
11        }
12        return ans;
13    }
14}