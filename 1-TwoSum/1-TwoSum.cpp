// Last updated: 4/24/2026, 8:15:33 AM
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> mp;
        vector<int> res;
        for (int i = 0; i < nums.size(); ++i) {
            int complement = target - nums[i];
            if (mp.find(complement) != mp.end()) {
                res.push_back(i);
                res.push_back(mp[complement]);
                break;
            } else {
                mp[nums[i]] = i;
            }
        }
        return res;
    }
};