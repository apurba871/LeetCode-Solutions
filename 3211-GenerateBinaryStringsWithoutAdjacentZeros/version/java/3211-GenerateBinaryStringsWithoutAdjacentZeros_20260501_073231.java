// Last updated: 5/1/2026, 7:32:31 AM
1class Solution {
2    public void recurse(List<String> res, String s, int n) {
3        if (s.length() > 1 && s.charAt(s.length() - 1) == '0' 
4        && s.charAt(s.length() - 2) == '0')
5            return;
6        if (s.length() == n) {
7            res.add(s);
8            return;
9        }
10        recurse(res, s + "0", n);
11        recurse(res, s + "1", n);
12    }
13    public List<String> validStrings(int n) {
14        List<String> res = new ArrayList<>();
15        recurse(res, "", n);
16        return res;
17    }
18}