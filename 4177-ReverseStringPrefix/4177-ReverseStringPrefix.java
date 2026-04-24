// Last updated: 4/24/2026, 8:13:03 AM
class Solution {
    public String reversePrefix(String s, int k) {
        String subStr = s.substring(0, k);
        String leftOver = s.substring(k);
        String revSubStr = new StringBuilder(subStr).reverse().toString();
        return revSubStr + leftOver;
    }
}