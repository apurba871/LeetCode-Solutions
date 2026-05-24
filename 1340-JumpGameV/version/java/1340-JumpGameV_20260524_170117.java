// Last updated: 5/24/2026, 5:01:17 PM
1class Solution {
2    int[] memo;
3    public int solve(int i, int[] arr, int d) {
4        if (memo[i] != -1)
5            return memo[i];
6        int result = 1; // include current position
7        //jump left
8        for (int j = i - 1; j >= i - d && j >= 0; --j) {
9            //break when we find a wall higher than /equal to our current height
10            if (arr[j] >= arr[i])
11                break;
12            result = Math.max(result, solve(j, arr, d) + 1);
13        }
14        //jump right
15        for (int j = i + 1; j <= i + d && j < arr.length; ++j) {
16            //break when we find a wall higher than /equal to our current height
17            if (arr[j] >= arr[i])
18                break;
19            result = Math.max(result, solve(j, arr, d) + 1);
20        }
21        return memo[i] = result;
22    }
23    public int maxJumps(int[] arr, int d) {
24        int res = 0;
25        memo = new int[arr.length + 1];
26        Arrays.fill(memo, -1);
27        for (int i = 0; i < arr.length; ++i) {
28            res = Math.max(res, solve(i, arr, d));
29        }
30        return res;
31    }
32}