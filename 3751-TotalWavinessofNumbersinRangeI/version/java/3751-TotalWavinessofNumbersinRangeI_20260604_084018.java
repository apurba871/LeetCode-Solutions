// Last updated: 6/4/2026, 8:40:18 AM
1class Solution {
2    public int totalWaviness(int num1, int num2) {
3        int ans = 0;
4        for (int i = num1; i <= num2; ++i) {
5            ans += countWaviness(i);
6        }
7        return ans;
8    }
9    public int countWaviness(int num) {
10        String numStr = num + "";
11        if (numStr.length() < 3)
12            return 0;
13        int waviness = 0;
14        for (int i = 1; i < numStr.length() - 1; ++i) {
15            char ch1 = numStr.charAt(i - 1);
16            char ch2 = numStr.charAt(i);
17            char ch3 = numStr.charAt(i + 1);
18            if (ch1 < ch2 && ch2 > ch3 || ch1 > ch2 && ch2 < ch3)
19                waviness++;
20        }
21        return waviness;
22    }
23}