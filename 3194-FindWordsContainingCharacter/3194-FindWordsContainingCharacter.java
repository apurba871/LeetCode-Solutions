// Last updated: 4/24/2026, 8:13:17 AM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        int idx = 0;
        for (String word : words) {
            if (word.indexOf(x) != -1)
                ans.add(idx);
            idx++;
        }
        return ans;
    }
}