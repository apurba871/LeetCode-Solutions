// Last updated: 4/24/2026, 8:15:17 AM
class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        ArrayList<Integer> elements = new ArrayList<>();
        int pos = -1;
        for (int i = len - 1; i > 0; --i) {
            elements.add(nums[i]);
            if (nums[i] > nums[i - 1]) {
                pos = i - 1;
                break;
            }
        }
        if (pos == -1) //given array is in descending order
            Arrays.sort(nums); //sort to get the next permutation
        else {
            Collections.sort(elements);
            for (int i = 0; i < elements.size(); ++i) {
                if (elements.get(i) > nums[pos]) {
                    int temp = nums[pos];
                    nums[pos] = elements.get(i);
                    elements.set(i, temp);
                    break;
                }
            }
            int idx = 0;
            for (int i = pos + 1; i < len; ++i) {
                nums[i] = elements.get(idx);
                idx++;
            }
        }
    }
}