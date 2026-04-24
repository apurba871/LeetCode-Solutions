// Last updated: 4/24/2026, 8:14:06 AM
class Solution {
public:
    int subtractProductAndSum(int n) {
        long long product = 1;
        long long sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            product *= lastDigit;
            sum += lastDigit;
            n /= 10;
        }
        return product - sum;
    }
};