// Last updated: 4/24/2026, 8:14:45 AM
class Solution {
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
    }
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        reverse(nums, 0, size - k - 1);
        //System.out.println(Arrays.toString(nums));
        reverse(nums, size - k, size - 1);
        //System.out.println(Arrays.toString(nums));
        reverse(nums, 0, size - 1);
        //System.out.println(Arrays.toString(nums));
    }
}