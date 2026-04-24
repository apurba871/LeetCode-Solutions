// Last updated: 4/24/2026, 8:13:27 AM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0)
                positives.add(nums[i]);
            else
                negatives.add(nums[i]);
        }
        int index = 0;
        for (int element : positives) {
            nums[index] = element;
            index += 2;
        }
        index = 1;
        for (int element : negatives) {
            nums[index] = element;
            index += 2;
        }
        return nums;
    }
}