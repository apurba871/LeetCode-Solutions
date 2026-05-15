// Last updated: 5/15/2026, 9:43:06 AM
1class Solution {
2    public void findCombinations(int index, int target, int[] candidates,
3    List<Integer> res, List<List<Integer>> ans) {
4        if (target == 0) {
5            ans.add(new ArrayList<>(res));
6            //res.clear();
7            return;
8        }
9        if (target < 0 || index == candidates.length)
10            return;
11        res.add(candidates[index]);
12        findCombinations(index, target - candidates[index], candidates, res, ans);
13        if (res.size() > 0)
14            res.remove(res.size() - 1);
15        findCombinations(index + 1, target, candidates, res, ans);
16    }
17    public List<List<Integer>> combinationSum(int[] candidates, int target) {
18        List<List<Integer>> ans = new ArrayList<>();
19        List<Integer> res = new ArrayList<>();
20        findCombinations(0, target, candidates, res, ans);
21        return ans;
22    }
23}