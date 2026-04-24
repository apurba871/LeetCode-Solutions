// Last updated: 4/24/2026, 8:15:02 AM
class Solution {
    private static boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return true;
            else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        int mid = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            int n = matrix[mid].length;
            if (matrix[mid][0] <= target && target <= matrix[mid][n - 1])
                return binarySearch(matrix[mid], target);
            else if (matrix[mid][0] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }
}