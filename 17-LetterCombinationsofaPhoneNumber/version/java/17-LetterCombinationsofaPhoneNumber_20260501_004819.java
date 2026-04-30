// Last updated: 5/1/2026, 12:48:19 AM
1class Solution {
2    public void constructMap(Map<Integer, String> map) {
3        map.put(2, "abc");
4        map.put(3, "def");
5        map.put(4, "ghi");
6        map.put(5, "jkl");
7        map.put(6, "mno");
8        map.put(7, "pqrs");
9        map.put(8, "tuv");
10        map.put(9, "wxyz");
11    }
12    public void computeCombinations(List<String> res, String s, Map<Integer, 
13        String> map, String digits, int i) {
14        if (s.length() == digits.length())
15            res.add(s);
16        if (i == digits.length())
17            return;
18        char dig = digits.charAt(i);
19        int n = Integer.parseInt(dig+"");
20        String str = map.get(n);
21        for (char ch : str.toCharArray()) {
22            computeCombinations(res, s+ch, map, digits, i + 1);
23        }
24        
25    }
26    public List<String> letterCombinations(String digits) {
27        Map<Integer, String> map = new HashMap<>();
28        constructMap(map);
29        List<String> res = new ArrayList<>();
30        computeCombinations(res, "", map, digits, 0);
31        return res;
32    }
33}