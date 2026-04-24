// Last updated: 4/24/2026, 8:13:58 AM
class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> res;
        int mx = *max_element(candies.begin(), candies.end());
        for (auto item : candies) {
            if (item + extraCandies >= mx)
                res.push_back(true);
            else
                res.push_back(false);
        }
        return res;
    }
};