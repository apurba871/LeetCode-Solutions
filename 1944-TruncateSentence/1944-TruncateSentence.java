// Last updated: 4/24/2026, 8:13:38 AM
class Solution {
    public String truncateSentence(String s, int k) {
        int spaceCounter = 0;
        String answer = "";
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == 32) spaceCounter++;
            if (spaceCounter != k) {
                answer += ch;
            } else break;
        }
        return answer;
    }
}