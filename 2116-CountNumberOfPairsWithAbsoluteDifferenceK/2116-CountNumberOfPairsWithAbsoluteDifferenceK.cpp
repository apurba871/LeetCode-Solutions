// Last updated: 4/24/2026, 8:13:33 AM
class Solution {
public:
    int countKDifference(vector<int>& nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.size() - 1; ++i) {
            for (int j = i + 1; j < nums.size(); ++j) {
                if (i < j && abs(nums[i] - nums[j]) == k)
                    ans++;
            }
        }
        return ans;
    }
};