// Last updated: 5/15/2026, 8:20:01 AM
1class Solution {
2    public int findMin(int[] nums) {
3        int n = nums.length;
4        int low = 0, high = n - 1;
5        while (low <= high) {
6            int mid = (low + high) >> 1;
7            if (low == high)
8                return nums[low];
9            else {
10                //check if both left half and right half are sorted
11                // if (nums[low] <= nums[mid] && nums[mid] <= nums[high]) {
12                     if (nums[low] <= nums[high]) {
13                    //array is not rotated, so return 1st element
14                    return nums[low];
15                } else if (nums[low] <= nums[mid]) { //left half is sorted
16                    low = mid + 1;
17                } else {
18                    high = mid;
19                }
20            }
21        }
22        return -1;
23    }
24}