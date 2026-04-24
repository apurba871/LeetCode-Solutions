// Last updated: 4/24/2026, 8:15:08 AM
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if (digits[n - 1] >= 0 && digits[n - 1] <= 8) {
            digits[n - 1]++;
            return digits;
        }
        else {
            digits[n - 1] = 0;
            for (int i = n - 2; i >= 0; --i) {
                if (digits[i] == 9)
                    digits[i] = 0;
                else {
                    digits[i]++;
                    break;
                }
            }
        }
        if (digits[0] == 0) {
            int[] ans = new int[n + 1];
            ans[0] = 1;
            for (int i = 1; i <= n; ++i) {
                ans[i] = digits[i - 1];
            }
            return ans;
        }
        return digits;
    }
}