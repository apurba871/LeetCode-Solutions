// Last updated: 4/24/2026, 8:14:10 AM
class Solution {
public:
    string defangIPaddr(string address) {
        string ans = "";
        for (char ch : address) {
            if (ch == '.')
                ans += "[.]";
            else
                ans += ch;
        }
        return ans;
    }
};