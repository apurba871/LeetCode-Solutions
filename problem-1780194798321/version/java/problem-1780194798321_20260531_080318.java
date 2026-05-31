// Last updated: 5/31/2026, 8:03:18 AM
1class Solution {
2    public int digitFrequencyScore(int n) {
3        int freq[] = new int[10];
4        int m = n;
5        while (m > 0) {
6            int dig = m % 10;
7            freq[dig]++;
8            m /= 10;
9        }
10        int ans = 0;
11        while (n > 0) {
12            int dig = n % 10;
13            if (freq[dig] != -1) {
14                ans += freq[dig] * dig;
15                freq[dig] = -1;
16            }
17            n /= 10;
18        }
19        return ans;
20    }
21}