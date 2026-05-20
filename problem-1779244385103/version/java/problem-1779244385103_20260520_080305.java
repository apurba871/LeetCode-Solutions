// Last updated: 5/20/2026, 8:03:05 AM
1class Solution {
2    public int[] findThePrefixCommonArray(int[] A, int[] B) {
3        int n = A.length;
4        int[] C = new int[n];
5        int match = 0;
6        int[] visA = new int[n + 1];
7        for (int i = 0; i < n; ++i) {
8            visA[A[i]] = 1;
9            if (A[i] == B[i])
10                match++;
11            else {
12                match = 0;
13                for (int j = i; j >= 0; --j) {
14                    if (visA[B[j]] == 1)
15                        match++;
16                }
17            }
18            C[i] = match;
19        }
20        return C;
21    }
22}