// Last updated: 4/24/2026, 8:14:13 AM
class Solution {
    public static int f(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        else return f(n - 1) + f(n - 2);
    }
    public int fib(int n) {
        return f(n);
    }
}