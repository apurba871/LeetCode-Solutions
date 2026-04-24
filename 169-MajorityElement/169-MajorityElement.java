// Last updated: 4/24/2026, 8:14:46 AM
class Solution {
    public int majorityElement(int[] nums) {
        int element = 0, count = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (count == 0) {
                element = nums[i];
                count++;
            }
            else if (element == nums[i])
                count++;
            else
                count--;
        }
        return element;
    }
}