// Last updated: 4/24/2026, 8:13:21 AM
class Solution {
public:
    int leftSum(vector<int>& nums, int idx) {
        return accumulate(nums.begin(), nums.begin() + idx, 0);
        /*
        int leftSum = 0;
        for (int i = 0; i < idx; ++i)
            leftSum += nums[i];
        return leftSum;
        */
    }
    int rightSum(vector<int>& nums, int idx) {
        return accumulate(nums.begin() + idx + 1, nums.end(), 0);
        /*
        int rightSum = 0;
        for (int i = idx + 1; i < nums.size(); ++i)
            rightSum += nums[i];
        return rightSum;
        */
    }
    vector<int> leftRigthDifference(vector<int>& nums) {
        vector<int> answer;
        for (int i = 0; i < nums.size(); ++i) {
            answer.push_back(abs(leftSum(nums, i) - rightSum(nums, i)));
        }
        return answer;
    }
};