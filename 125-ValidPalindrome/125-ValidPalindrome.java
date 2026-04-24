// Last updated: 4/24/2026, 8:14:57 AM
class Solution {
    public static String myTrimFunction(String s) {
        String trimmedString = "";
        for (char ch : s.toCharArray()) {
            if (ch >= 65 && ch <= 90)
                ch = (char) (ch + 32);
            else if ((ch < 97 || ch > 122) && (ch < 48 || ch > 57))
                continue;
            trimmedString += ch;
        }
        return trimmedString;
    }
    public boolean isPalindrome(String s) {
        String trimmedString = myTrimFunction(s);
        return trimmedString.equals(new StringBuilder(trimmedString).reverse().toString());
    }
}