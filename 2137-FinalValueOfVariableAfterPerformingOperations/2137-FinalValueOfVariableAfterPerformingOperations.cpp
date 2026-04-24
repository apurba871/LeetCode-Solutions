// Last updated: 4/24/2026, 8:13:32 AM
class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        int ans = 0;
        for (string str : operations) {
            if (str == "++X" || str == "X++") ans++;
            else ans--;
        }
        return ans;
    }
};