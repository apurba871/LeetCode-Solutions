// Last updated: 4/24/2026, 8:14:59 AM
class Solution {
    private List<Integer> pascalRow(List<Integer> prevRow) {
        List<Integer> currRow = new ArrayList<>();
        currRow.add(1);
        for (int i = 0; i < prevRow.size() - 1; ++i) {
            currRow.add(prevRow.get(i) + prevRow.get(i + 1));
        }
        currRow.add(1);
        return currRow;
    }
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 1)
            return List.of(List.of(1));
        else if (numRows == 2)
            return List.of(List.of(1), List.of(1, 1));
        else {
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(List.of(1));
            List<Integer> prevRow = List.of(1, 1);
            ans.add(prevRow);
            for (int i = 3; i <= numRows; ++i) {
                prevRow = pascalRow(prevRow);
                ans.add(prevRow);
            }
            return ans;
        }
    }
}