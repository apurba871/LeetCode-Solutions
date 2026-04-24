// Last updated: 4/24/2026, 8:14:35 AM
class Solution {
    public void moveZeroes(int[] nums) {
        // int countZeroes = 0;
        // int idx = 0;
        // for (int i = 0 ; i < nums.length; ++i) {
        //     if (nums[i] != 0) {
        //         int val = nums[idx];
        //         nums[idx] = nums[i];
        //         nums[i] = val;
        //         idx++;
        //     }
        // }

        int j = -1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < nums.length; ++i) {
            if (j!= -1 && nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}