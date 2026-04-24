// Last updated: 4/24/2026, 8:15:23 AM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> triplet = Arrays.asList(nums[i], 
                    nums[j], nums[k]);
                    //Collections.sort(triplet);
                    ans.add(triplet);
                    j++;
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                    k--;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                    // while (j < k && nums[j] == nums[j - 1])
                    //     j++;
                } else {
                    k--;
                    // while (i < k && nums[k] == nums[k + 1])
                    //     k--;
                }
            }
        }
        return ans;
    }
}