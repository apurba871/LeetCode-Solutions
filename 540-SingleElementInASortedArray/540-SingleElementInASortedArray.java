// Last updated: 4/24/2026, 8:14:26 AM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 1, high = n - 2;
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];
        while (low <= high) {
            int mid = (low + high) / 2;
            //check if element at mid is the single element
            if (nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1])
                return nums[mid];
            else {
                //figure out which half the single element is in
                if (mid % 2 == 0 && nums[mid] == nums[mid + 1]) //element in right half
                    low = mid + 1;
                else if (mid % 2 == 1 && nums[mid] == nums[mid - 1])
                    low = mid + 1;
                else 
                    high = mid - 1;
            }
        }
        return -1;
    }
}