// Last updated: 4/24/2026, 8:13:28 AM
class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int words = 0;
        for (string sent : sentences) {
            int spaces = 0;
            for (char ch : sent) {
                if (ch == ' ') spaces++;
            }
            words = max(words, spaces + 1);
        }
        return words;
    }
};