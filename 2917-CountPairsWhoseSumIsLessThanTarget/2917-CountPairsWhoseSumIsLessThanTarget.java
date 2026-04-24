// Last updated: 4/24/2026, 8:13:19 AM
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int ans = 0;
        int n = nums.size();
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums.get(i) + nums.get(j) < target)
                    ans++;
            }
        }
        return ans;
    }
}