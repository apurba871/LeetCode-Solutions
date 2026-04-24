// Last updated: 4/24/2026, 8:14:49 AM
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (low == high)
                return nums[low];
            else {
                //check if both left half and right half are sorted
                // if (nums[low] <= nums[mid] && nums[mid] <= nums[high]) {
                     if (nums[low] <= nums[high]) {
                    //array is not rotated, so return 1st element
                    return nums[low];
                } else if (nums[low] <= nums[mid]) { //left half is sorted
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
        }
        return -1;
    }
}