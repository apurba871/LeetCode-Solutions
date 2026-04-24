// Last updated: 4/24/2026, 8:13:23 AM
class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for (String query : queries) {
            char[] q = query.toCharArray();
            for (String dict : dictionary) {
                char[] d = dict.toCharArray();
                int n = dict.length();
                int cnt = 0;
                for (int i = 0; i < n; ++i) {
                    if (q[i] != d[i])
                        cnt++;
                    if (cnt > 2)
                        break;
                }
                if (cnt <= 2) {
                    ans.add(query);
                    break;
                }
            }
        }
        return ans;
    }
}