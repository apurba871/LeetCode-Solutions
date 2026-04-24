// Last updated: 4/24/2026, 8:12:56 AM
class Solution {
    public char mirrorLetter(char ch) {
        int offset = ch - 97;
        return (char)('z' - offset);
    }
    public char mirrorDigit(char ch) {
        int offset = ch - 48;
        return (char)('9' - offset);
    }
    public int mirrorFrequency(String s) {
        int[] seen = new int[123];
        int[] freq = new int[123];
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (seen[c] != -1) {
                char m;
                if (c >= 'a' && c <= 'z')
                    m = mirrorLetter(c);
                else
                    m = mirrorDigit(c);
                ans += Math.abs(freq[c] - freq[m]);
                seen[m] = -1;
                seen[c] = -1;
            }
        }
        return ans;
    }
}