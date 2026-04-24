// Last updated: 4/24/2026, 8:14:29 AM
class Solution {
    private static boolean possibleToSplit(int[] nums, int k, int mid) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (sum + nums[i] <= mid) {
                sum += nums[i];
            } else {
                count++;
                sum = nums[i];
            }
        }
        return count <= k;
    }
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possibleToSplit(nums, k, mid))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}