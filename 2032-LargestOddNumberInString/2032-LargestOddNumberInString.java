// Last updated: 4/24/2026, 8:13:37 AM
class Solution {
    public String largestOddNumber(String num) {
        String oddStr = "";
        int idx = -1;
        for (int i = num.length() - 1; i >= 0; --i) {
            char ch = num.charAt(i);
            if (ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9') {
                idx = i;
                break;
            }
        }
        return idx == -1 ? "" : num.substring(0, idx + 1);
    }
}