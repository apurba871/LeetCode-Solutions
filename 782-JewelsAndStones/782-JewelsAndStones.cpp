// Last updated: 4/24/2026, 8:14:20 AM
class Solution {
public:
    int numJewelsInStones(string J, string S) {
        int ctr = 0;
        for (char ch : S) {
            //cout << ch << endl;
            if (J.find(ch) != string::npos)
                ctr++;
        }
        return ctr;
    }
};