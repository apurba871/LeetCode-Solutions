// Last updated: 11/13/2026, 8:20:05 AM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        int ans = 0;
4        Arrays.sort(s);
5        for (int i = 0; i < g.length; ++i) {
6            for (int j = 0; j < s.length; ++j) {
7                if (s[j] >= g[i]) {
8                    ans++;
9                    s[j] = -1;
10                    break;
11                }
12            }
13        }
14        return ans;
15    }
16}