// Last updated: 4/24/2026, 8:14:07 AM
class Solution {
public:
    int balancedStringSplit(string s) {
        int cnt = 0;
        int ans = 0;
        for (const char &ch : s) {
            if (ch == 'R')
                cnt++;
            else
                cnt--;
            if (cnt == 0)
                ans++;
        }
        return ans;
    }
};