// Last updated: 4/24/2026, 8:13:59 AM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> target = new LinkedList<>();
        for (int i = 0; i < nums.length; ++i) {
            target.add(index[i], nums[i]);
        }
        int[] targetArray = new int[nums.length];
        /*
        Object[] obj = target.toArray();

        for (int i = 0; i < nums.length; ++i) {
            targetArray[i] = (int)obj[i];
        }
        */

        for (int i = 0; i < nums.length; ++i) {
            targetArray[i] = target.get(i);
        }
        return targetArray;
    }
}