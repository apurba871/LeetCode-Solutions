// Last updated: 4/24/2026, 8:14:21 AM
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; ++i) {
            String binary = "";
            int num = i;
            while (num > 0) {
                int rem = num % 2;
                binary = rem + binary;
                num /= 2;
            }
            //System.out.println("binary: " + binary);
            ans += countPrime(binary);
        }
        return ans;
    }
    private int countPrime(String binary) {
        int setBits = 0;
        for (char ch : binary.toCharArray()) {
            if (ch == '1') setBits++;
        }
        //System.out.println("setBits: " + setBits);
        for (int i = 2; i < setBits; ++i) {
            if (setBits % i == 0)
                return 0;
        }
        return setBits == 1 ? 0 : 1;
    }
}