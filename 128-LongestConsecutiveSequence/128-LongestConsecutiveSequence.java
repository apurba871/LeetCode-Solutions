// Last updated: 4/24/2026, 8:14:56 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        if (len == 0)
            return 0;
        else {
            Set<Integer> hashSet = new HashSet<>();
            int count = 1, largestCount = Integer.MIN_VALUE;
            for (int i : nums)
                hashSet.add(i);
            for (Integer it : hashSet) {
                int element = it;
                count = 1;
                if (!hashSet.contains(element - 1)) {
                    while (hashSet.contains(element + 1)) {
                        count++;
                        element++;
                    }
                }
                largestCount = Math.max(largestCount, count);
            }
            return largestCount;
        }
    }
}