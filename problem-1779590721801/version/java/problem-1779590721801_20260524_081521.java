// Last updated: 5/24/2026, 8:15:21 AM
1class Solution {
2    public int passwordStrength(String password) {
3        Set<Character> set = new HashSet<>();
4        for (char ch : password.toCharArray()) {
5            set.add(ch);
6        }
7        int s = 0;
8        for (char ch : set) {
9            if (ch >= 'a' && ch <= 'z')
10                s += 1;
11            else if (ch >= 'A' && ch <= 'Z')
12                s += 2;
13            else if (ch >= '0' && ch <= '9')
14                s += 3;
15            else if (ch == '!' || ch == '@' || ch == '#' || ch == '$')
16                s += 5;
17        }
18        return s;
19    }
20}