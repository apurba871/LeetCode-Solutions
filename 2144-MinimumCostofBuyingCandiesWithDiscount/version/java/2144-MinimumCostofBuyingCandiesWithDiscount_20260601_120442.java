// Last updated: 6/1/2026, 12:04:42 PM
1class Solution {
2    public int minimumCost(int[] cost) {
3        if (cost.length == 1)
4            return cost[0];
5        Arrays.sort(cost);
6        int ans = 0;
7        int n = cost.length;
8        for (int i = n - 1; i >= 0; --i) {
9            int x, y;
10            if (cost[i] != -1) {
11                x = cost[i];
12                ans += x;
13                y = -1;
14                for (int j = i - 1; j >= 0; --j) {
15                    if (y != -1) {
16                        cost[j] = -1;
17                        break;
18                    }
19                    if (cost[j] != -1 && y == -1) {
20                        y = cost[j];
21                        cost[j] = -1;
22                        ans += y;
23                    }
24                }
25            }
26        }
27        return ans;
28    }
29}