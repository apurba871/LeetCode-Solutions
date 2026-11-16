// Last updated: 11/16/2026, 7:36:54 AM
1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        boolean ans = true;
4        int fiveCnt = 0, tenCnt = 0;
5        for (int i = 0; i < bills.length && ans == true; ++i) {
6            if (bills[i] == 5)
7                fiveCnt++;
8            else {
9                int bill = bills[i];
10                if (bill == 10 ) {
11                    if (fiveCnt > 0) {
12                        tenCnt++;
13                        fiveCnt--;
14                    } 
15                    else return false;
16                } 
17                else if (bill == 20) {
18                    //System.out.println("FiveCnt: " + fiveCnt + " TenCnt: " + tenCnt);
19                    if (tenCnt > 0 && fiveCnt > 0) {
20                        tenCnt--;
21                        fiveCnt--;
22                    } 
23                    else if(fiveCnt > 2)
24                        fiveCnt -= 3;
25                    else 
26                        return false;
27                }
28            }
29        }
30        return ans;
31    }
32}