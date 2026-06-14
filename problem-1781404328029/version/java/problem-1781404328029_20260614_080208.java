// Last updated: 6/14/2026, 8:02:08 AM
1class Solution {
2    public boolean checkGoodInteger(int n) {
3        int m = n;
4        int digitSum = 0, squareSum = 0;
5        while (m > 0) {
6            int dig = m % 10;
7            digitSum += dig;
8            squareSum += dig * dig;
9            m /= 10;
10        }
11        return squareSum - digitSum >= 50;
12    }
13}