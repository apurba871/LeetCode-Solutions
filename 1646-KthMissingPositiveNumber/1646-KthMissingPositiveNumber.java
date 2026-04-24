// Last updated: 4/24/2026, 8:13:53 AM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int nums[] = new int[10001];
        for (int i = 1; i <= 10000; ++i) {
            boolean flag = true;
            for (int j = 0; j < arr.length; ++j) {
                if (i == arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                nums[i] = i;
        }
        // for (int i : nums) {
        //     System.out.println(i);
        // }
        int missing[] = new int [10000];
        int idx = 0;
        for (int i : nums) {
            if (i != 0)
            missing[idx++] = i;
        }
        // for (int i : missing) {
        //     System.out.println(i);
        // }
        return missing[k - 1];
    }
}