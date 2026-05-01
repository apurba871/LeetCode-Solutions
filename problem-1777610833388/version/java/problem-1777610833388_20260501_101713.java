// Last updated: 5/1/2026, 10:17:13 AM
1class Solution {
2    public void findSubsets(List<List<Integer>> list, int[] nums, int i) {
3        if (i == nums.length)
4            return;
5        List<List<Integer>> tmp = new ArrayList<>(list);
6        for (var subset : tmp) {
7            List<Integer> sub = new ArrayList<>(subset);
8            sub.add(nums[i]);
9            list.add(sub);
10        }
11        findSubsets(list, nums, i+1);
12    }
13    public List<List<Integer>> subsets(int[] nums) {
14        List<List<Integer>> list = new ArrayList<>();
15        list.add(new ArrayList<>());
16        findSubsets(list, nums, 0);
17        return list;
18    }
19}