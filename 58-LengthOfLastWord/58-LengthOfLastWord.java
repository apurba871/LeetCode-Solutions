// Last updated: 4/24/2026, 8:15:09 AM
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String sb = new StringBuilder(s).reverse().toString();
        String wrd = sb.substring(0, sb.indexOf(' ') == -1 ? sb.length() : sb.indexOf(' '));
        return wrd.length();
    }
}