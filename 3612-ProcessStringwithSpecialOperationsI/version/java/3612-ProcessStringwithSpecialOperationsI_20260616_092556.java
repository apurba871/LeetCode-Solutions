// Last updated: 6/16/2026, 9:25:56 AM
1class Solution {
2    public String processStr(String s) {
3        StringBuilder sb = new StringBuilder();
4        for (char ch : s.toCharArray()) {
5            if (ch >= 'a' && ch <= 'z')
6                sb.append(ch);
7            else if (ch == '#')
8                sb.append(sb);
9            else if (ch == '%')
10                sb.reverse();
11            else if (ch == '*' && sb.length() > 0)
12                sb.deleteCharAt(sb.length() - 1);
13        }
14        return sb.toString();
15    }
16}