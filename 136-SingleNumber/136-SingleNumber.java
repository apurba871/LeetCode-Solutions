// Last updated: 4/24/2026, 8:14:54 AM
class Solution {
    public int singleNumber(int[] nums) {
        int xor = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}