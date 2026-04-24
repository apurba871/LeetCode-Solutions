// Last updated: 4/24/2026, 8:15:28 AM
class Solution {
    public boolean isPalindrome(int x) {
        // String input = String.valueOf(x);
        // return input.equals(new StringBuilder(input).reverse().toString());

        if (x < 0)
            return false;
        int xx = x;
        int revNum = 0;
        while (x > 0) {
            int lastDigit = x % 10;
            revNum = revNum * 10 + lastDigit;
            x /= 10;
        }
        return xx == revNum;
    }
}