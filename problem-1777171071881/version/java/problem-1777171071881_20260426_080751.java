// Last updated: 4/26/2026, 8:07:51 AM
1class Solution {
2    public List<Integer> findValidElements(int[] nums) {
3        List<Integer> ans = new ArrayList<>();
4        ans.add(nums[0]);
5        for (int i = 1; i < nums.length - 1; ++i) {
6            boolean flag1 = true;
7            for (int j = i - 1; j >= 0; --j) {
8                if (nums[i] <= nums[j]) {
9                    flag1 = false;
10                    break;
11                }
12            }
13            boolean flag2 = true;
14            for (int j = i + 1; j < nums.length; ++j) {
15                if (nums[i] <= nums[j]) {
16                    flag2 = false;
17                    break;
18                }
19            }
20            if (flag1 || flag2)
21                ans.add(nums[i]);
22        }
23        if (nums.length > 1)
24            ans.add(nums[nums.length - 1]);
25        return ans;
26    }
27}