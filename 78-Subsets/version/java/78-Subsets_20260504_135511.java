// Last updated: 5/4/2026, 1:55:11 PM
1class Solution {
2    public void findSubsets(List<List<Integer>> list, List<Integer> subset, 
3                            int[] nums, int i) {
4        if (i == nums.length) {
5            //System.out.println(subset);
6            list.add(new ArrayList<>(subset));
7            return;
8        }
9        subset.add(nums[i]);
10        findSubsets(list, subset, nums, i + 1);
11        subset.remove(subset.size() - 1);
12        findSubsets(list, subset, nums, i + 1);
13    }
14    public List<List<Integer>> subsets(int[] nums) {
15        List<List<Integer>> list = new ArrayList<>();
16        List<Integer> subset = new ArrayList<>();
17        findSubsets(list, subset, nums, 0);
18        return list;
19    }
20}