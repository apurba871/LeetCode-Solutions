// Last updated: 4/24/2026, 8:14:09 AM
class Solution {
    public int[] replaceElements(int[] arr) {
        int idx = arr.length - 1;
        int max = Integer.MIN_VALUE;
        for (int i = idx; i >= 0; --i) {
            int prevMax = max;
            max = Math.max(max, arr[i]);
            if (i == idx)
                arr[i] = -1;
            else
                arr[i] = prevMax;
        }
        return arr;
    }
}