// Last updated: 4/24/2026, 8:14:18 AM
class Solution {
    private int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high)
            return -1;
        else {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                return binarySearch(nums, low, mid - 1, target);
            else
                return binarySearch(nums, mid + 1, high, target);
        }
    }
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }
}