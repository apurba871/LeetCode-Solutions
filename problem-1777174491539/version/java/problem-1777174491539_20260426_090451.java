// Last updated: 4/26/2026, 9:04:51 AM
1class Solution {
2    public String sortVowels(String s) {
3        Map<Character, Integer> map = new HashMap<>();
4        String str = "";
5        for (int i = 0; i < s.length(); ++i) {
6            char ch = s.charAt(i);
7            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
8                map.put(ch, map.getOrDefault(ch, 0) + 1);
9                if (str.indexOf(ch) == -1)
10                    str += ch;
11            }
12        }
13        List<Character> list = new ArrayList<>();
14        for (char c : str.toCharArray()) {
15            list.add(c);
16        }
17
18        // Stable sort by frequency (descending)
19        list.sort((a, b) -> map.get(b) - map.get(a));
20
21        // Build result string
22        StringBuilder result = new StringBuilder();
23        for (char c : list) {
24            result.append(c);
25        }
26        str = result.toString();
27        String str2 = str;
28        String ans = "";
29        for (int i = 0; i < s.length(); ++i) {
30            char ch = s.charAt(i);
31            if (str2.indexOf(ch) == -1)
32                ans += ch;
33            else {
34                //System.out.println(str);
35                char strch = str.charAt(0);
36
37                ans += strch;
38                //System.out.println("ans " + ans);
39                map.put(strch, map.get(strch) - 1);
40                if (map.get(strch) == 0) {
41                    str = str.substring(1);
42                    //System.out.println(str);
43                }
44
45            }
46        }
47        return ans;
48    }
49}