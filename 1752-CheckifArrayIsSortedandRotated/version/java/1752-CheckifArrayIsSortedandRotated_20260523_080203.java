// Last updated: 5/23/2026, 8:02:03 AM
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int dec=0;
        for (int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                dec++;
            }
        }
        if(dec>1){
            return false;
        }
        return true;
    }
}