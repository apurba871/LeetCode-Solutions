// Last updated: 4/24/2026, 8:13:56 AM
class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        //partial_sum(begin(nums), end(nums), begin(nums));
        partial_sum(nums.begin(), nums.end(), nums.begin());
        return nums;
    }
    // vector<int> runningSum(vector<int>& nums) {
    //     vector<int> ans;
    //     int sum = 0;
    //     for (int item : nums) {
    //         sum += item;
    //         ans.push_back(sum);
    //     }
    //     return ans;
    // }
};