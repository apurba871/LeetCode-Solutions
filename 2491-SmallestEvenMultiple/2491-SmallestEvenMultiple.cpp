// Last updated: 4/24/2026, 8:13:24 AM
class Solution {
public:
    int smallestEvenMultiple(int n) {
        if (n % 2) return n * 2;
        else return n;
    }
};