// Last updated: 4/24/2026, 8:14:22 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = (char)123;
        for (char ch : letters) {
            if (ch > target && ch < ans) {
                ans = ch;
            }
        }
        return ans == 123 ? letters[0] : ans;
    }
}