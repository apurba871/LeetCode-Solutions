// Last updated: 4/28/2026, 12:38:06 PM
1class Solution {
2    public double pow(double x, long N) {
3        if (N == 0)
4            return 1;
5        double val = pow(x, N / 2);
6        if (N % 2 == 0)
7            return val * val;
8        else
9            return val * val * x;
10    }
11
12    public double myPow(double x, int n) {
13        long N = n;
14        boolean neg = false;
15        if (N < 0) {
16            neg = true;
17            N = -N;
18        }
19        double result = pow(x, N);
20        return neg ? 1/result : result;
21    }
22}