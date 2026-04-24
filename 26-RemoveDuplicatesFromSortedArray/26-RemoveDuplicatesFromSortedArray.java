// Last updated: 4/24/2026, 8:15:20 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        // Set<Integer> set = new TreeSet<>();
        // for (int i = 0; i < nums.length; ++i) {
        //     set.add(nums[i]);
        // }
        // int uniqueElements = set.size();
        // int index = 0;
        // for (int element : set) {
        //     nums[index++] = element;
        // }
        // return uniqueElements;

        // int x = nums[0];
        // int uniqueElements = 1;
        // int index = 1;
        // for (int i = 1; i < nums.length; ++i) {
        //     if (nums[i] != x) {
        //         x = nums[i];
        //         nums[index++] = x;
        //         uniqueElements++;
        //     }
        // }
        // return uniqueElements;

        int i = 0;
        for (int j = 1; j < nums.length; ++j) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
        
        // int l = 0, ans = 1;
        // for (int i = 1; i < nums.length; ++i) {
        //     if (nums[l] != nums[i]) {
        //         l++;
        //         nums[l] = nums[i];
        //         ans++;
        //     }
        // }
        // return ans;
    }
}