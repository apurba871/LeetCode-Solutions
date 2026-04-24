// Last updated: 4/24/2026, 8:14:38 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; //rows
        int n = matrix[0].length; //cols
        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] < target)
                row++;
            else
                col--;
        }
        return false;
    }
}