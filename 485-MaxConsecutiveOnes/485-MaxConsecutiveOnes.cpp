// Last updated: 4/24/2026, 8:14:30 AM
class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int ones = 0, maxOnes = 0;
        for (int item : nums) {
            if (item)
                ones++;
            else {
                if (ones > maxOnes)
                    maxOnes = ones;
                ones = 0;
            }
        }
        if (ones > maxOnes)
            maxOnes = ones;
        return maxOnes;
    }
};