// Last updated: 4/24/2026, 8:14:27 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i : nums) {
            if (i == 0)
                count = 0;
            else {
                count++;
                max = Math.max(max, count);
            }
        }
        return max < 0 ? 0 : max;
    }
}