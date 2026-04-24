// Last updated: 4/24/2026, 8:15:32 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[] {i, map.get(comp)};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}