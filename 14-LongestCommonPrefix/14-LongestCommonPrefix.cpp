// Last updated: 4/24/2026, 8:15:29 AM
class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string lcp = "";
        string firstStr = strs[0];
        for (int i = 0; i < firstStr.size(); ++i) {
            bool flag = true;
            for (int j = 1; j < strs.size(); ++j) {
                if (i + 1 > strs[j].size() || firstStr[i] != strs[j][i]) {
                    goto outer;
                }
            }
            if (flag) lcp += firstStr[i];
        }
        outer:
        return lcp;
    }
};