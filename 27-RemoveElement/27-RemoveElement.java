// Last updated: 4/24/2026, 8:15:19 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int[] aux = new int [nums.length];
        int idx = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                k++;
                aux[idx++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = aux[i];
        }
        return k;
    }
}