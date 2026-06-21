// Last updated: 6/21/2026, 9:50:12 AM
1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        Arrays.sort(costs);
4        int cnt = 0;
5        for (int item : costs) {
6            if (item <= coins) {
7                coins -= item;
8                cnt++;
9            }
10        }
11        return cnt;
12    }
13}