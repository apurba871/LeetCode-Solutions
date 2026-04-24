// Last updated: 4/24/2026, 8:13:22 AM
class Solution {
public:
    int differenceOfSum(vector<int>& nums) {
        int elementSum = accumulate(nums.begin(), nums.end(), 0);
        int digitSum = 0;
        for (int element : nums) {
            while (element > 0) {
                digitSum += element % 10;
                element = element / 10;
            }
        }
        return abs(elementSum - digitSum);
    }
};