// Last updated: 4/24/2026, 8:13:36 AM
class Solution {
    public int[] findPeakGrid(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            int currElement = matrix[row][col];
            boolean left = col - 1 < 0 ? true : currElement > matrix[row][col - 1];
            boolean right = col + 1 >= n ? true : currElement > matrix[row][col + 1];
            boolean top = row - 1 < 0 ? true : currElement > matrix[row - 1][col];
            boolean bottom = row + 1 >= m ? true : currElement > matrix[row + 1][col];
            if (left && right && top && bottom)
                return new int[] {row, col};
            else if (!left) //left
                col--;
            else if (!right) //right
                col++;
            else if (!top) //top
                row--;
            else if (!bottom) //bottom
                row++;
        }  
        return new int[] {-1, -1};
    }
}