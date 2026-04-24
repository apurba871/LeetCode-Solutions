// Last updated: 4/24/2026, 8:14:24 AM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int prevRem = -1;
        while (n > 0) {
            int rem = n % 2;
            if (prevRem != -1 && prevRem == rem)
                return false;
            prevRem = rem;
            n = n / 2;
        }
        return true;
    }
}