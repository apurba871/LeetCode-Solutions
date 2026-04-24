// Last updated: 4/24/2026, 8:13:42 AM
class Solution {
    public int[] rotate(int[] arr) {
        int elem = arr[0];
        int n = arr.length;
        for (int j = 0; j < n - 1; ++j) {
            arr[j] = arr[j + 1];
        }
        arr[n - 1] = elem;
        return arr;
    }
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] arr = Arrays.copyOf(nums, n);
        for (int i = 0; i <= n - 1; ++i) {
            arr = rotate(arr);
            boolean flag = true;
            for (int x : arr)
                System.out.print(x + " ");
            System.out.println();
            for (int j = 0; j < n - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) return true;
        }
        return false;
    }
}