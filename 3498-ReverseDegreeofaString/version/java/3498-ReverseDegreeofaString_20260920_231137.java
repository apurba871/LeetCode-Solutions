// Last updated: 9/20/2026, 11:11:37 PM
1class Solution {
2    public int reverseDegree(String s) {
3        int i = 0;
4        int ans = 0;
5        for (char ch : s.toCharArray()) {
6            int revIdx = 'z' - ch + 1;
7            ans += revIdx * (++i);
8        }
9        return ans;
10    }
11}