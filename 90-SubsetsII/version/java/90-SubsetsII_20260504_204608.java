// Last updated: 5/4/2026, 8:46:08 PM
1class Solution {
2    public void findSubsets(Set<List<Integer>> ansSet, List<Integer> subset,
3    int[] nums, int idx) {
4        if (idx == nums.length) {
5            Collections.sort(subset);
6            ansSet.add(new ArrayList<>(subset));
7            return;
8        }
9        subset.add(nums[idx]);
10        findSubsets(ansSet, subset, nums, idx + 1);
11        subset.remove(subset.size() - 1);
12        findSubsets(ansSet, subset, nums, idx + 1);
13    }
14
15    public List<List<Integer>> subsetsWithDup(int[] nums) {
16        Arrays.sort(nums);
17        Set<List<Integer>> ansSet = new HashSet<>();
18        List<Integer> subset = new ArrayList<>();
19        findSubsets(ansSet, subset, nums, 0);
20        List<List<Integer>> ans = new ArrayList<>();
21        for (var currentSet : ansSet) {
22            List<Integer> res = new ArrayList<>();
23            for (var item : currentSet) {
24                res.add(item);
25            }
26            ans.add(res);
27        }
28        return ans;
29    }
30}