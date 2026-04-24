// Last updated: 4/24/2026, 8:13:34 AM
class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        int n = nums.size();
        for (int i = 0; i < n; ++i) {
            nums.push_back(nums[i]);
        }
        return nums;
    }
};