// Last updated: 4/24/2026, 8:15:01 AM
class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (nums[mid] == target)
                return true;
            boolean leftSorted = true;
            for (int i = low; i < mid; ++i) {
                if (nums[i] > nums[i + 1]) {
                    leftSorted = false;
                    break;
                }
            }
            if (leftSorted) {
                if (nums[low] <= target && target <= nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (nums[mid] <= target && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return false;
    }
}