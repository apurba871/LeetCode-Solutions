// Last updated: 4/24/2026, 8:13:51 AM
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length - 1];
        while (low <= high) {
            int mid = (low + high) / 2;
            boolean flag = canPlaceAtDistanceI(position, m, mid);
            if (!flag)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return high;
    }
    private static boolean canPlaceAtDistanceI(int[] position, int m, int i) {
        int count = 1;
        int last = position[0];
        for (int j = 1; j < position.length; ++j) {
            if (position[j] - last >= i) {
                count++;
                last = position[j];
                if (count >= m)
                    return true;
            }
        }
        return false;
    }
}