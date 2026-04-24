// Last updated: 4/24/2026, 8:13:25 AM
class Solution {
public:
    int arithmeticTriplets(vector<int>& nums, int diff) {
        int ans = 0;
        vector<int> freq(10005, 0);
        for (int item : nums) {
            freq[item]++;
        }
        for (int i = 0; i < nums.size(); ++i) {
            if (freq[nums[i] + diff] != 0 && freq[nums[i] + diff + diff] != 0)
                ans++;
        }
        return ans;
    }
};