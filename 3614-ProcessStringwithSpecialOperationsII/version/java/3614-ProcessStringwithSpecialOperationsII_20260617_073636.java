// Last updated: 6/17/2026, 7:36:36 AM
1class Solution {
2
3    public char processStr(String s, long k) {
4        long len = 0;
5        for (int i = 0; i < s.length(); i++) {
6            char c = s.charAt(i);
7            switch (c) {
8                case '*':
9                    if (len > 0) {
10                        len--;
11                    }
12                    break;
13                case '#':
14                    len *= 2;
15                    break;
16                case '%':
17                    break;
18                default:
19                    len++;
20                    break;
21            }
22        }
23        if (k + 1 > len) {
24            return '.';
25        }
26        for (int i = s.length() - 1; i >= 0; i--) {
27            char c = s.charAt(i);
28            switch (c) {
29                case '*':
30                    len++;
31                    break;
32                case '#':
33                    if (k + 1 > (len + 1) / 2) {
34                        k -= len / 2;
35                    }
36                    len = (len + 1) / 2;
37                    break;
38                case '%':
39                    k = len - k - 1;
40                    break;
41                default:
42                    if (k + 1 == len) {
43                        return c;
44                    }
45                    len--;
46                    break;
47            }
48        }
49        return '.';
50    }
51}