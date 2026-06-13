// Last updated: 6/13/2026, 10:44:26 AM
1class Solution {
2
3    public String mapWordWeights(String[] words, int[] weights) {
4        StringBuilder ans = new StringBuilder(words.length);
5        for (String word : words) {
6            int s = 0;
7            for (int i = 0; i < word.length(); i++) {
8                s += weights[word.charAt(i) - 'a'];
9            }
10            ans.append((char) ('z' - (s % 26)));
11        }
12        return ans.toString();
13    }
14}