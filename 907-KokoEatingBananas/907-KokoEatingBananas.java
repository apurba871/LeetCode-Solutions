// Last updated: 4/24/2026, 8:14:16 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = Arrays.stream(piles).max().getAsInt();
        int low = 1;
        int high = max;
        while (low <= high) {
            int k = low + (high - low) / 2;
            long count = 0;
            for (int i = 0; i < n; ++i) {
                if (piles[i] <= k)
                    count++;
                else {
                    count += (int) Math.ceil(piles[i] / (double)k);
                    //System.out.println("count: " + count);
                }
            }
            if (count <= h)
                high = k - 1;
            else
                low = k + 1;
        }
        return low;
    }
}