// Last updated: 4/24/2026, 8:14:01 AM
class Solution {
    public int countNegatives(int[][] grid) {
        return (int) Arrays.stream(grid)
                .flatMapToInt(Arrays::stream)
                .filter(x -> x < 0)
                .count();
    }
}