// Last updated: 4/24/2026, 8:13:44 AM
class Solution {
public:
    string interpret(string command) {
        string ans = "";
        for (int i = 0; i < command.length(); ++i) {
            if (command[i] == 'G')
                ans += 'G';
            if (command[i] == '(' && command[i + 1] == ')') {
                ans += 'o';
                i++;
            }
            if (command[i] == '(' && command[i + 1] == 'a') {
                ans += "al";
                i += 3;
            }
        }
        return ans;
    }
};