// Last updated: 4/24/2026, 8:15:14 AM
class Solution {
    private int firstOccurrence(int[] nums, int target, int n) {
        int firstOcrIdx = -1;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                firstOcrIdx = mid;
                high = mid - 1;
            } else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return firstOcrIdx;
    }

    private int lastOccurrence(int[] nums, int target, int n) {
        int lastOcrIdx = n;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high)/ 2;
            if (nums[mid] == target) {
                lastOcrIdx = mid;
                low = mid + 1;
            } else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return lastOcrIdx;
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1, -1};
        ans[0] = firstOccurrence(nums, target, n);
        if (ans[0] != -1)
            ans[1] = lastOccurrence(nums, target, n);
        return ans;
    }
}