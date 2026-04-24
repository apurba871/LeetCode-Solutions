// Last updated: 4/24/2026, 8:14:17 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        String str = s;
        for (int i = 0; i < s.length(); ++i) {
            str = str.substring(1, str.length()) + str.charAt(0);
            if (str.equals(goal))
                return true;
        }
        return false;
    }
}