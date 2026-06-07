// Last updated: 6/7/2026, 8:09:01 AM
1class Solution {
2    public int sumOfGoodIntegers(int n, int k) {
3        int sum = 0;
4        for (int i = 0; i <= n + k; ++i) {
5            if ((n & i) == 0 && Math.abs(n - i) <= k)
6                sum += i;
7        }
8        return sum;
9    }
10}