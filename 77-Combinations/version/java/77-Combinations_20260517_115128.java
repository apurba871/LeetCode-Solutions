// Last updated: 5/17/2026, 11:51:28 AM
1class Solution {
2    public void findCombinations(int i, int n, int k, 
3        List<List<Integer>> ans, List<Integer> res) {
4        if (res.size() == k) {
5            ans.add(new ArrayList<>(res));
6            return;
7        }
8        if (i == n)
9            return;
10        res.add(i + 1);
11        findCombinations(i + 1, n, k, ans, res);
12        res.remove(res.size() - 1);
13        findCombinations(i + 1, n, k, ans, res);
14    }
15    public List<List<Integer>> combine(int n, int k) {
16        List<List<Integer>> ans = new ArrayList<>();
17        findCombinations(0, n, k, ans, new ArrayList<>());
18        return ans;
19    }
20}