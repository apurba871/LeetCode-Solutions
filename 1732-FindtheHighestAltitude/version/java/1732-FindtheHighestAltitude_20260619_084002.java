// Last updated: 6/19/2026, 8:40:02 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int max = 0, x = 0;
4        for (int i : gain) {
5            x = x + i;
6            max = Math.max(max, x);
7        }
8        return max;
9    }
10}