// Last updated: 5/11/2026, 10:48:36 AM
1class Solution {
2    public int[] separateDigits(int[] nums) {
3        List<Integer> ansList = new ArrayList<>();
4        for (int item : nums) {
5            List<Integer> digits = new ArrayList<>();
6            while (item > 0) {
7                int digit = item % 10;
8                item = item / 10;
9                digits.add(digit);
10            }
11            Collections.reverse(digits);
12            for (int num : digits) {
13                ansList.add(num);
14            }
15        }
16        int sz = ansList.size();
17        int[] ans = new int [sz];
18        int idx = 0;
19        for (int x : ansList) {
20            ans[idx++] = x;
21        }
22        return ans;
23    }
24}