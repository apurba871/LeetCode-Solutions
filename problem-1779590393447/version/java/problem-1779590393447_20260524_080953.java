// Last updated: 5/24/2026, 8:09:53 AM
1class Solution {
2    public int[] limitOccurrences(int[] nums, int k) {
3        Set<Integer> set = new TreeSet<>();
4        int[] hash = new int[101];
5        int sz = 0;
6        for (int i : nums) {
7            set.add(i);
8            hash[i]++;
9            sz++;
10            if (hash[i] > k) {
11                hash[i]--;
12                sz--;
13            }
14        }
15        int[] ans = new int[sz];
16        int idx = 0;
17        for (int i : set) {
18            for (int j = 0; j < Math.min(k, hash[i]); ++j) {
19                ans[idx++] = i;
20            }
21        }
22        return ans;
23    }
24}