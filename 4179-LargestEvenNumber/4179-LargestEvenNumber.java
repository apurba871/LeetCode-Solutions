// Last updated: 4/24/2026, 8:13:01 AM
class Solution {
    public String largestEven(String s) {
        int idx = s.lastIndexOf("2");
        if (idx != -1)
            return s.substring(0, idx + 1);
        else
            return "";
    }
}