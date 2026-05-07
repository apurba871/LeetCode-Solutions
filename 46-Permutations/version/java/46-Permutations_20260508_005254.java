// Last updated: 5/8/2026, 12:52:54 AM
1class Solution {
2    public void solve(List<List<Integer>> ans, List<Integer> res, int[] nums) {
3        if (res.size() == nums.length) {
4            ans.add(new ArrayList<>(res));
5            return;
6        }
7        for (int i = 0; i < nums.length; ++i) {
8            if (res.contains(nums[i]))
9                continue;
10            res.add(nums[i]);
11            solve(ans, res, nums);
12            res.remove(res.size() - 1);
13        }
14        
15    }
16    public List<List<Integer>> permute(int[] nums) {
17        List<List<Integer>> ans = new ArrayList<>();
18        List<Integer> res = new ArrayList<>();
19        solve(ans, res, nums);
20        return ans;
21    }
22}