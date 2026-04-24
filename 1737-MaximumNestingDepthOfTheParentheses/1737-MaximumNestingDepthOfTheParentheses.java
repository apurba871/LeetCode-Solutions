// Last updated: 4/24/2026, 8:13:49 AM
class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == '(') {
                count++;
                ans = Math.max(ans, count);
            } else if (ch == ')') {
                count--;
            }
        }
        return ans;
    }
}