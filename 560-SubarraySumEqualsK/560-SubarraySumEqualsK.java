// Last updated: 4/24/2026, 8:14:25 AM
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        hash.put(0, 1);
        int ans = 0;
        int prefSum = 0;
        for (int i = 0; i < nums.length; ++i) {
            prefSum += nums[i];
            int cnt = hash.getOrDefault(prefSum - k, 0);
            ans += cnt;
            hash.put(prefSum, hash.getOrDefault(prefSum, 0) + 1);
        }
        return ans;
    }
}