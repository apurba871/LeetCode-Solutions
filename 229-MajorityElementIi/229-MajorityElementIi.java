// Last updated: 4/24/2026, 8:14:41 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for (int i : nums) {
            if (cnt1 == 0 && i != el2) {
                cnt1 = 1;
                el1 = i;
            }
            else if (cnt2 == 0 && i != el1) {
                cnt2 = 1;
                el2 = i;
            }
            else if (el1 == i)
                cnt1++;
            else if (el2 == i)
                cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0;
        int targetCount = nums.length / 3;
        for (int i : nums) {
            if (i == el1)
                cnt1++;
            else if (i == el2)
                cnt2++;
        }
        if (cnt1 > targetCount)
            ans.add(el1);
        if (cnt2 > targetCount && el1 != el2)
            ans.add(el2);
        return ans;
    }
}