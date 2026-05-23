// Last updated: 5/23/2026, 7:59:40 AM
1class Solution {
2    public int[] rotate(int[] arr) {
3        int elem = arr[0];
4        int n = arr.length;
5        for (int j = 0; j < n - 1; ++j) {
6            arr[j] = arr[j + 1];
7        }
8        arr[n - 1] = elem;
9        return arr;
10    }
11    public boolean check(int[] nums) {
12        int n = nums.length;
13        int[] arr = Arrays.copyOf(nums, n);
14        for (int i = 0; i <= n - 1; ++i) {
15            arr = rotate(arr);
16            boolean flag = true;
17
18            for (int j = 0; j < n - 1; ++j) {
19                if (arr[j] > arr[j + 1]) {
20                    flag = false;
21                    break;
22                }
23            }
24            if (flag) return true;
25        }
26        return false;
27    }
28}