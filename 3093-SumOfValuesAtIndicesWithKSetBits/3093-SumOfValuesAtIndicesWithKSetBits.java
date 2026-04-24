// Last updated: 4/24/2026, 8:13:18 AM
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int n = nums.size();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            if (Integer.bitCount(i) == k)
                A.add(i);
        }

        int sum = 0;
        for (int i : A)
            sum += nums.get(i);
        
        return sum;
    }
}