// Last updated: 4/24/2026, 8:14:00 AM
class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        // vector<int> ans;
        // for (int i = 0; i < nums.size(); ++i) {
        //     int count = 0;
        //     for (int j = 0; j < nums.size(); ++j) {
        //         if (nums[i] > nums[j])
        //             count++;
        //     }
        //     ans.push_back(count);
        // }
        // return ans;
        int countOfItem[101] = {0}; // 0...100
        for (int item : nums) {
            countOfItem[item]++;
        }
        vector<int> ans;
        for (int item : nums) {
            int cnt = 0;
            for (int i = 0; i < item; ++i) {
                cnt += countOfItem[i];
            }
            ans.push_back(cnt);
        }
        return ans;
    }
};