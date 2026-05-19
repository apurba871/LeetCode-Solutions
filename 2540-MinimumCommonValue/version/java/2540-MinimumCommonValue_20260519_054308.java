// Last updated: 5/19/2026, 5:43:08 AM
1class Solution {
2    public boolean binarySearch (int[] nums, int val) {
3        int low = 0, high = nums.length - 1;
4        while (low <= high) {
5            int mid = (low + high) / 2;
6            if (nums[mid] == val)
7                return true;
8            else if (nums[mid] < val)
9                low = mid + 1;
10            else
11                high = mid - 1;
12        }
13        return false;
14    }
15    public int getCommon(int[] nums1, int[] nums2) {
16        for (int i : nums2) {
17            if (binarySearch(nums1, i))
18                return i;
19        }
20        return -1;
21    }
22}