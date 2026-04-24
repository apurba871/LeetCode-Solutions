// Last updated: 4/24/2026, 8:13:10 AM
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int [n];
        for (int i = 0; i < n; ++i) {
            if (nums[i] >= 0)
                result[i] = nums[((i + nums[i]) % n)];
            else
                result[i] = nums[(n + ((i + nums[i]) % n)) % n];
        }
        return result;
    }
}