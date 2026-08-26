// Last updated: 8/26/2026, 9:54:07 PM
1class Solution {
2
3    public String shortestBeautifulSubstring(String s, int k) {
4        int n = s.length();
5        for (int m = k; m <= n; m++) {
6            String ans = "";
7            for (int i = m; i <= n; i++) {
8                String t = s.substring(i - m, i);
9                int cnt = 0;
10                for (int j = 0; j < t.length(); j++) {
11                    cnt += t.charAt(j) - '0';
12                }
13                if ((ans.isEmpty() || t.compareTo(ans) < 0) && cnt == k) {
14                    ans = t;
15                }
16            }
17            if (!ans.isEmpty()) {
18                return ans;
19            }
20        }
21        return "";
22    }
23}