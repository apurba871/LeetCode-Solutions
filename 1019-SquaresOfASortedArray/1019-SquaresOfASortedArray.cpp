// Last updated: 4/24/2026, 8:14:12 AM
class Solution {
public:
    vector<int> sortedSquares(vector<int>& A) {
        vector<int> nums;
        for (int item : A) {
            nums.push_back(item * item);
        }
        sort(nums.begin(), nums.end());
        return nums;
    }
};