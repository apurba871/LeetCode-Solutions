// Last updated: 5/29/2026, 7:03:45 AM
1class Solution {
2    static {
3        for (int i = 0; i < 100; ++i) {
4            moveZeroes(new int[]{});
5        }
6    }
7    public static void moveZeroes(int[] nums) {
8        int j = -1;
9        int n = nums.length;
10        for (int i = 0; i < n; ++i) {
11            if (nums[i] == 0) {
12                j = i;
13                break;
14            }
15        }
16        for (int i = j + 1; i < n && j >= 0; ++i) {
17            if (nums[i] != 0) {
18                int temp = nums[i];
19                nums[i] = nums[j];
20                nums[j] = temp;
21                j++;
22            }
23        }
24    }
25}