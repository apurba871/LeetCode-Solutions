// Last updated: 4/24/2026, 8:15:30 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int x : nums1)
            list.add(x);
        for (int x : nums2)
            list.add(x);
        Collections.sort(list);
        int idx1 = list.size() / 2;
        int idx2 = idx1 - 1;
        int idx = 0;
        int x, y;
        x = y = -1;
        for (int i : list) {
            if (idx == idx1)
                x = i;
            if (idx == idx2)
                y = i;
            idx++;
        }
        if (list.size() % 2 == 0)
            return (x + y) / 2.0;
        return x;
    }
}