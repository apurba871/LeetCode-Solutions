// Last updated: 4/24/2026, 8:15:26 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLenStr = 201;
        for (String str : strs) {
            minLenStr = Math.min(minLenStr, str.length());
        }
        String ans = "";
        for (int i = 0; i < minLenStr; ++i) {
            for (String str : strs) {
                if (str.substring(0, i + 1).equals(strs[0].substring(0, i + 1)))
                    continue;
                else
                    return ans; 
            }
            ans = strs[0].substring(0, i + 1);
        }
        return ans;
    }
}