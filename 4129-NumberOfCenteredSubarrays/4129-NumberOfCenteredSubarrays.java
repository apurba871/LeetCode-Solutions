// Last updated: 4/24/2026, 8:13:06 AM
class Solution {
    public int centeredSubarrays(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for (int j = i; j < n; ++j) {
                sum += nums[j];
                list.add(nums[j]);
                if (list.contains(sum))
                    ans++;
            }
        }
        return ans;
    }
}