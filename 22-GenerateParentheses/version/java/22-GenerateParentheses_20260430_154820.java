// Last updated: 4/30/2026, 3:48:20 PM
1class Solution {
2    public void generate(List<String> res, String s, int openCnt, int closeCnt, int n) {
3        if (s.length() == 2*n) {
4            res.add(s);
5            return;
6        }
7        if (closeCnt <= openCnt && openCnt < n)
8            generate(res, s + "(", openCnt + 1, closeCnt, n);
9        if (closeCnt < n)
10            generate(res, s + ")", openCnt, closeCnt + 1, n);
11    }
12    public List<String> generateParenthesis(int n) {
13        List<String> res = new ArrayList<>();
14        generate(res, "", 0, 0, n);
15        return res;
16    }
17}