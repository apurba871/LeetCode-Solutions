// Last updated: 5/25/2026, 10:10:08 AM
1class Solution {
2    int[] memo;
3    public boolean solve(int idx, String s, int minJump, int maxJump) {
4        if (memo[idx] != -1)
5            return memo[idx] == 0 ? false : true;
6        if (idx == s.length() - 1 && s.charAt(idx) == '0') {
7            memo[idx] = 1;
8            return true;
9        }
10        for (int i = idx + minJump; i <= Math.min(idx + maxJump, s.length() - 1); ++i) {
11            if (s.charAt(i) == '0') {
12                boolean possible = solve(i, s, minJump, maxJump);
13                if (possible) {
14                    memo[i] = 1;
15                    return true;
16                }
17            }
18        }
19        memo[idx] = 0;
20        return false;
21    }
22    public boolean canReach(String s, int minJump, int maxJump) {
23        /* recursion with memoization solution will also give TLE
24        if (s.charAt(s.length() - 1) == '1')
25            return false;
26        memo = new int [s.length()];
27        Arrays.fill(memo, -1);
28        return solve(0, s, minJump, maxJump);
29        */
30
31        int n = s.length();
32        if (s.charAt(n - 1) == '1')
33            return false;
34        Queue<Integer> que = new LinkedList<>();
35        que.offer(0);
36        int far = 0;
37        while (!que.isEmpty()) {
38            int curr = que.poll();
39            if (curr == n - 1)
40                return true;
41            int start = curr + minJump;
42            int end = Math.min(curr + maxJump, n - 1);
43            start = Math.max(start, far + 1);
44            for (int i = start; i <= end; ++i) {
45                if (s.charAt(i) == '0')
46                    que.offer(i);
47            }
48            far = Math.max(far, end);
49        }
50        return false;
51    }
52}