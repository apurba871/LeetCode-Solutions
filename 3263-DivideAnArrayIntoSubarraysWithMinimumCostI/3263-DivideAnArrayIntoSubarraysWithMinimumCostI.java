// Last updated: 4/24/2026, 8:13:13 AM
class Solution {
    public int minimumCost(int[] nums) {
        int cost = nums[0];
        int mini = 51;
        int miniPos = -1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < mini) {
                mini = nums[i];
                miniPos = i;
            }
        }
        int mini2 = 51;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < mini2 && i != miniPos) {
                mini2 = nums[i];
            }
        }
        return cost + mini + mini2;
    }
}