// Last updated: 6/7/2026, 8:32:18 AM
1class Solution {
2    public static List<String> generateBinaryStrings(int n) {
3        List<String> result = new ArrayList<>();
4        if (n <= 0)
5            return result;
6        backtrack(n, new StringBuilder(), result);
7        return result;
8    }
9
10    private static void backtrack(int n, StringBuilder current, List<String> result) {
11        if (current.length() == n) {
12            result.add(current.toString());
13            return;
14        }
15        current.append('0');
16        backtrack(n, current, result);
17        current.deleteCharAt(current.length() - 1);
18        current.append('1');
19        backtrack(n, current, result);
20        current.deleteCharAt(current.length() - 1);
21    }
22    public List<String> generateValidStrings(int n, int k) {
23        List<String> res = generateBinaryStrings(n);
24        //List<String> temp = new ArrayList<>();
25        List<String> ans = new ArrayList<>();
26        //check consecutive 1s
27        for (String str : res) {
28            boolean flag = false;
29            for (int i = 0; i < str.length() - 1; ++i) {
30                char ch = str.charAt(i);
31                char ch2 = str.charAt(i + 1);
32                if (ch == ch2 && ch2 == '1') {
33                    flag = true;
34                    break;
35                }
36            }
37            if (flag == false && getCost(str) <= k)
38                ans.add(str);
39        }
40        return ans;
41    }
42    private int getCost(String str) {
43        int cost = 0;
44        for (int i = 0; i < str.length(); ++i) {
45            char ch = str.charAt(i);
46            if (ch == '1')
47                cost += i;
48        }
49        return cost;
50    }
51}