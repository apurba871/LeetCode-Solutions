// Last updated: 4/24/2026, 8:15:31 AM
class Solution {
public:
    bool isPalindrome(int x) {
        int xx = x;
        long revNum = 0L;
        while (xx > 0) {
            int digit = xx % 10;
            revNum = revNum * 10L + digit;
            xx /= 10;
        }
        return revNum == x;
    }
};