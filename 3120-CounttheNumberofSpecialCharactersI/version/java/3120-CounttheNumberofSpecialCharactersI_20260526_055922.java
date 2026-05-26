// Last updated: 5/26/2026, 5:59:22 AM
1class Solution {
2    public int numberOfSpecialChars(String word) {
3        String lower = word.toLowerCase();
4        String distinct = "";
5        for (char ch : lower.toCharArray()) {
6            if (distinct.indexOf(ch) == -1)
7                distinct += ch;
8        }
9        int count = 0;
10        for (char ch : distinct.toCharArray()) {
11            if (word.indexOf(ch) != -1 && word.indexOf(ch - 32) != -1)
12                count++;
13        }
14        return count;
15    }
16}