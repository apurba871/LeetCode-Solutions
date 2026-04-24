// Last updated: 4/24/2026, 8:13:46 AM
class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& word1, vector<string>& word2) {
        string string1 = "", string2 = "";
        for (auto item : word1) {
            string1 += item;
        }
        for (auto item : word2) {
            string2 += item;
        }
        return string1 == string2 ? true : false;
    }
};