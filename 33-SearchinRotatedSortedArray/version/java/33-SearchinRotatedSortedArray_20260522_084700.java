// Last updated: 5/22/2026, 8:47:00 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int low = 0, high = n - 1;
5        while (low <= high) {
6            int mid = (low + high) / 2;
7            if (nums[mid] == target)
8                return mid;
9            //check if left half is sorted
10            if (nums[low] <= nums[mid]) {
11                if (nums[low] <= target && target <= nums[mid])
12                    high = mid - 1;
13                else
14                    low = mid + 1;
15            } else { // second half is sorted
16                if (nums[mid] <= target && target <= nums[high])
17                    low = mid + 1;
18                else
19                    high = mid - 1;
20            }
21        }
22        return -1;
23    }
24}