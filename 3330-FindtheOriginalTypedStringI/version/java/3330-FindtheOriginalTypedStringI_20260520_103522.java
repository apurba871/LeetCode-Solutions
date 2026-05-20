// Last updated: 5/20/2026, 10:35:22 AM
1class Solution {
2    public int possibleStringCount(String word) {
3        int count = 1;
4        for (int i = 1; i < word.length(); ++i) {
5            char ch = word.charAt(i - 1);
6            char ch2 = word.charAt(i);
7            if (ch == ch2)
8                count++;
9        }
10        return count;
11    }
12}