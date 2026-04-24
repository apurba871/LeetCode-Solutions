// Last updated: 4/24/2026, 8:14:05 AM
class Solution {
    private static int getMax(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > ans)
                ans = num;
        }
        return ans;
    }

    private static int getSum(int[] nums, int mid) {
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceil(num * 1.0 / mid);
        }
        //System.out.println("Sum: " + sum + " mid: " + mid);
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = getMax(nums);
        
        while (low <= high) {
            int mid = (low + high) / 2;
            int sum = getSum(nums, mid);
            if (sum > threshold) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}