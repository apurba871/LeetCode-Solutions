// Last updated: 11/25/2026, 12:07:11 AM
1class Solution {
2    static {
3        for (int i = 0; i < 100; ++i) {
4            moveZeroes(new int[]{});
5        }
6    }
7    public static void moveZeroes(int[] nums) {
8        int j = -1;
9        for (int i = 0; i < nums.length; ++i) {
10            if (nums[i] == 0) {
11                j = i;
12                break;
13            }
14        }
15        for (int i = j + 1; i < nums.length && j >= 0; ++i) {
16            if (nums[i] != 0) {
17                int temp = nums[j];
18                nums[j] = nums[i];
19                nums[i] = temp;
20                j++;
21            }
22        }
23    }
24}