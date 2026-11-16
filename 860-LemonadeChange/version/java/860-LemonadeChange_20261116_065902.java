// Last updated: 11/16/2026, 6:59:02 AM
1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        boolean ans = true;
4        List<Integer> changeInHand = new ArrayList<>();
5        int j = 0;
6        for (int i = 0; i < bills.length && ans == true; ++i) {
7            if (bills[i] == 5)
8                changeInHand.add(5);
9            else
10                ans = getChange(changeInHand, bills[i]);
11        }
12        return ans;
13    }
14    public boolean getChange(List<Integer> changeInHand, int bill) {
15        Collections.sort(changeInHand);
16        if (bill == 10 ) {
17            if (changeInHand.contains(5)) {
18                changeInHand.add(10);
19                changeInHand.remove(Integer.valueOf(5));
20            } else return false;
21        } else if (bill == 15) {
22            if (changeInHand.contains(10)) {
23                changeInHand.add(15);
24                changeInHand.remove(Integer.valueOf(10));
25            } else {
26                int idx1 = changeInHand.indexOf(5);
27                int idx2 = changeInHand.lastIndexOf(5);
28                if (idx1 != -1 && idx1 != idx2) {
29                    changeInHand.add(15);
30                    changeInHand.remove(Integer.valueOf(5));
31                    changeInHand.remove(Integer.valueOf(5));
32                } else return false;
33            }
34        } else if (bill == 20) {
35            if (changeInHand.contains(15))
36                changeInHand.remove(Integer.valueOf(15));
37            else if (changeInHand.contains(10) && changeInHand.contains(5)) {
38                changeInHand.remove(Integer.valueOf(10));
39                changeInHand.remove(Integer.valueOf(5));
40            } else {
41                int idx1 = changeInHand.indexOf(5);
42                int idx2 = changeInHand.lastIndexOf(5);
43                if (idx1 != -1 && idx1 != idx2 && Math.abs(idx1 - idx2) >= 2) {
44                    changeInHand.remove(Integer.valueOf(5));
45                    changeInHand.remove(Integer.valueOf(5));
46                    changeInHand.remove(Integer.valueOf(5));
47                } else return false;
48            }
49        }
50        return true;
51    }
52}