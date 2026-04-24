// Last updated: 4/24/2026, 8:13:55 AM
class Solution {
    private int binarySearch(int[] bloomDay, int low, int high, int m, int k) {
        int mid = -1;
        int n = bloomDay.length;
        while (low <= high) {
            mid = (low + high) / 2;
            int cnt = 0, numBouquets = 0;
            for (int i = 0; i < n; ++i) {
                if (bloomDay[i] <= mid)
                    cnt++;
                else {
                    numBouquets += cnt / k;
                    cnt = 0;
                }
            }
            numBouquets += cnt / k;
            if (numBouquets >= m)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        //System.out.println("n: " + n);
        if (m > n / k)
            return -1;
        int low = Arrays.stream(bloomDay).min().getAsInt(), high = Arrays.stream(bloomDay).max().getAsInt();
        int ans = binarySearch(bloomDay, low, high, m, k);
        return ans;
    }
}