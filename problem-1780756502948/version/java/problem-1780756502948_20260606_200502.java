// Last updated: 6/6/2026, 8:05:02 PM
1class Solution {
2    public boolean consecutiveSetBits(int n) {
3        String binary = Integer.toBinaryString(n);
4        int pair = 0;
5        int sz = binary.length();
6        for (int i = 0; i < sz - 1; ++i) {
7            char ch1 = binary.charAt(i);
8            char ch2 = binary.charAt(i + 1);
9            if (ch1 == ch2 && ch1 == '1')
10                pair++;
11        }
12        if (pair == 1)
13            return true;
14        else
15            return false;
16    }
17}