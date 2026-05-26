// Last updated: 5/26/2026, 6:26:30 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        List<Integer> nonZ = new ArrayList<>();
4        for (int i : nums) {
5            if (i != 0)
6                nonZ.add(i);
7        }
8        for (int i = 0; i < nums.length; ++i) {
9            if ((i + 1) <= nonZ.size())
10                nums[i] = nonZ.get(i);
11            else
12                nums[i] = 0;
13        }
14    }
15}