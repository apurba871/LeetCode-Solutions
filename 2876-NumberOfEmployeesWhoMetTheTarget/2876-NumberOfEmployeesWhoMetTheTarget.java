// Last updated: 4/24/2026, 8:13:20 AM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;
        for (int i : hours)
            if (i >= target)
                ans++;
        return ans;
    }
}