// Last updated: 4/24/2026, 8:13:45 AM
class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.size(); ++i) {
            int customerBalance = 0;
            for (int j = 0; j < accounts[i].size(); ++j) {
                customerBalance += accounts[i][j];
            }
            maxWealth = max(maxWealth, customerBalance);
        }
        return maxWealth;
    }
};