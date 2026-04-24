// Last updated: 4/24/2026, 8:13:35 AM
class Solution {
public:
    vector<int> buildArray(vector<int>& nums) {
        vector<int> ans(nums.size());
        int idx = 0;
        for (int &i : ans) {
            i = nums[nums[idx++]];
        }
        return ans;
    }
};