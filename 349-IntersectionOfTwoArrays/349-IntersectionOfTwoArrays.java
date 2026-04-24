// Last updated: 4/24/2026, 8:14:31 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();
        for (int num : nums1)
            firstSet.add(num);
        for (int num : nums2)
            secondSet.add(num);
        List<Integer> commonNums = new ArrayList<>();
        for (int element1 : firstSet) {
            for (int element2 : secondSet) {
                if (element1 == element2)
                    commonNums.add(element1);
            }
        }
        int resultArr[] = new int[commonNums.size()];
        int idx = 0;
        for (int elem : commonNums) {
            resultArr[idx++] = elem;
        }
        return resultArr;
    }
}