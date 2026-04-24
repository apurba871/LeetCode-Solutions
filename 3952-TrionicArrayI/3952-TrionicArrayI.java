// Last updated: 4/24/2026, 8:13:10 AM
class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        boolean flag1 = false, flag2 = false, flag3 = false;
        for (int i = 0; i < n - 1; ++i) {
            if (nums[i] < nums[i + 1] && !flag2 && !flag3) {
                flag1 = true;
            } else if (nums[i] > nums[i + 1] && flag1 && !flag3) {
                flag2 = true;
            } else if (nums[i] < nums[i + 1] && flag1 && flag2) {
                flag3 = true;
            } else {
                return false;
            }
        }
        return flag1 && flag2 && flag3;
    }
}