// Last updated: 5/21/2026, 9:12:52 AM
1class Solution {
2    public int longestCommonPrefix(int[] arr1, int[] arr2) {
3        Set<Integer> pref = new HashSet<>();
4        for (int i : arr1) {
5            String num = i + "";
6            for (int j = 0; j < num.length(); ++j) {
7                String str = num.substring(0, j + 1);
8                pref.add(Integer.parseInt(str));
9            }
10        }
11        int ans = 0;
12        for (int i : arr2) {
13            String num = i + "";
14            int len = num.length();
15            for (int j = 0; j < len; ++j) {
16                String str = num.substring(0, len - j);
17                int numStr = Integer.parseInt(str);
18                if (pref.contains(numStr)) {
19                    ans = Math.max(ans, str.length());
20                }
21            }
22        }
23        return ans;
24    }
25}