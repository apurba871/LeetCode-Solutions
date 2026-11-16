// Last updated: 11/16/2026, 7:04:44 AM
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
21        } else if (bill == 20) {
22            if (changeInHand.contains(15))
23                changeInHand.remove(Integer.valueOf(15));
24            else if (changeInHand.contains(10) && changeInHand.contains(5)) {
25                changeInHand.remove(Integer.valueOf(10));
26                changeInHand.remove(Integer.valueOf(5));
27            } else {
28                int idx1 = changeInHand.indexOf(5);
29                int idx2 = changeInHand.lastIndexOf(5);
30                if (idx1 != -1 && idx1 != idx2 && Math.abs(idx1 - idx2) >= 2) {
31                    changeInHand.remove(Integer.valueOf(5));
32                    changeInHand.remove(Integer.valueOf(5));
33                    changeInHand.remove(Integer.valueOf(5));
34                } else return false;
35            }
36        }
37        return true;
38    }
39}