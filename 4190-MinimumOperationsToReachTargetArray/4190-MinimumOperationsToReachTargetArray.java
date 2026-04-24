// Last updated: 4/24/2026, 8:12:58 AM
class Solution {
    public int minOperations(int[] nums, int[] target) {
        Set<Integer> mySet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target[i]) {
                mySet.add(nums[i]);
            }
        }

        return mySet.size();
    }
}