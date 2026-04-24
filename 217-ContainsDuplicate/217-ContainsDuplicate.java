// Last updated: 4/24/2026, 8:14:42 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        for (int num : nums) {
            if (!hash.contains(num))
                hash.add(num);
            else
                return true;
        }
        return false;
    }
}