// Last updated: 4/24/2026, 8:13:04 AM
class Solution {
    public int mirrorDistance(int n) {
       String rev = new StringBuilder(n+"").reverse().toString();
       int nx = Integer.parseInt(rev);
       return (int)Math.abs(n - nx);
    }
}