// Last updated: 4/24/2026, 8:14:03 AM
class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int even = 0;
        for (int item : nums) {
            int numDigits = 0;
            while (item > 0) {
                ++numDigits;
                item /= 10;
            }
            if (!(numDigits & 1))
                even++;
        }
        return even;
    }
};