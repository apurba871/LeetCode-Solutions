// Last updated: 4/29/2026, 6:04:15 AM
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
19        double result = 1;
20        while (N > 0) {
21            if (N % 2 == 1)
22                result *= x;
23            x *= x;
24            N /= 2;
25        }
26        return neg ? 1/result : result;
27    }
28}