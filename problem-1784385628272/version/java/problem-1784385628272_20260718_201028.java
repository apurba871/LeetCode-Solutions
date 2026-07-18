// Last updated: 7/18/2026, 8:10:28 PM
1class Solution {
2    public int findGCD(int[] nums) {
3        int max = Arrays.stream(nums).max().getAsInt();
4        int min = Arrays.stream(nums).min().getAsInt();
5        int gcd = 1;
6        for (int i = 1; i <= min; ++i) {
7            if (max % i == 0 && min % i == 0)
8                gcd = i;
9        }
10        return gcd;
11    }
12}