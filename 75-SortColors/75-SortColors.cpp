// Last updated: 4/24/2026, 8:15:07 AM
class Solution {
public:
    void sortColors(vector<int>& nums) {
        //sort(nums.begin(), nums.end());
        int cnt_zero = 0, cnt_one = 0, cnt_two = 0;
        for (int item : nums) {
            if (item == 0)
                cnt_zero++;
            if (item == 1)
                cnt_one++;
            if (item == 2)
                cnt_two++;
        }
        for (int &item : nums) {
            if (cnt_zero-- > 0) {
                item = 0;
            } else if (cnt_one-- > 0) {
                item = 1;
            } else if (cnt_two-- > 0) {
                item = 2;
            }
        }
    }
};