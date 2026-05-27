// Last updated: 5/27/2026, 7:20:34 AM
1class Solution {
2    public int numberOfSpecialChars(String word) {
3        int[] letters = new int [26];
4        int[] cap = new int [26];
5        Arrays.fill(letters, -1);
6        Arrays.fill(cap, 0);
7        int count = 0;
8        for (int i = 0; i < word.length(); ++i) {
9            char ch = word.charAt(i);
10            if (ch >= 'a' && ch <= 'z' &&  letters[ch - 'a'] == -1)
11                letters[ch - 'a']++;
12            else if (ch >= 'A' && ch <= 'Z' && letters[ch - 'A'] == -1)
13                letters[ch - 'A'] = 2;
14            else if (ch >= 'A' && ch <= 'Z' && letters[ch - 'A'] == 0 && cap[ch - 'A'] == 0) {
15                count++;
16                cap[ch - 'A'] = 1;
17            }
18            else if (ch >= 'a' && ch <= 'z' && letters[ch - 'a'] == 0 && cap[ch - 'a'] == 1) {
19                count--;
20                letters[ch - 'a'] = 2;
21            }
22        }
23        return count;
24    }
25}