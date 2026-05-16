// Last updated: 5/16/2026, 8:31:38 AM
1class Solution {
2    public int findMin(int[] nums) {
3        int low = 0, high = nums.length - 1;
4        
5        // Use low < high because when low == high, we've found our minimum
6        while (low < high) {
7            int mid = low + (high - low) / 2; // Prevents potential integer overflow
8            
9            if (nums[mid] > nums[high]) {
10                // Minimum must be in the right unsorted part
11                low = mid + 1;
12            } else if (nums[mid] < nums[high]) {
13                // Minimum is at mid or to the left
14                high = mid;
15            } else {
16                // Critical step for duplicates: 
17                // nums[mid] == nums[high], so reduce the search space safely
18                high--;
19            }
20        }
21        
22        return nums[low];
23    }
24}