// Last updated: 4/24/2026, 8:15:10 AM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int top = 0, left = 0, right = matrix[0].length - 1, bottom = matrix.length - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; ++i) {
                ans.add(matrix[top][i]);
            }
            top++;
            boolean flag = false;
            for (int i = top; i <= bottom; ++i) {
                ans.add(matrix[i][right]);
                flag = true;
            }
            right--;
            boolean flag2 = false;
            for (int i = right; i >= left && flag; --i) {
                ans.add(matrix[bottom][i]);
                flag2 = true;
            }
            bottom--;
            for (int i = bottom; i >= top && flag2; --i) {
                ans.add(matrix[i][left]);
            }
            left++;
        }
        return ans;
    }
}