// Last updated: 5/4/2026, 9:50:06 AM
1class Solution {
2    private void reverse(int[] matrix) {
3        int i = 0, j = matrix.length - 1;
4        while (i < j) {
5            int temp = matrix[i];
6            matrix[i] = matrix[j];
7            matrix[j] = temp;
8            i++;
9            j--;
10        }
11    }
12    public void rotate(int[][] matrix) {
13        int n = matrix.length;
14        for (int i = 0; i < n - 1; ++i) {
15            for (int j = i + 1; j < n; ++j) {
16                int temp = matrix[i][j];
17                matrix[i][j] = matrix[j][i];
18                matrix[j][i] = temp;
19            }
20        }
21        for (int i = 0; i < n; ++i) {
22            reverse(matrix[i]);
23        }
24    }
25}