// Last updated: 4/24/2026, 8:14:50 AM
class Solution {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        String ans = "";
        for (int i = str.length - 1; i >= 0; --i)
            ans += str[i] + " ";
        return ans.trim();
    }
}