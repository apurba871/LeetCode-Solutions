// Last updated: 4/24/2026, 8:13:31 AM
class Solution {
    public int nextBeautifulNumber(int n) {
        boolean flag = true;
        int ans;
        for (int x = n + 1; ;x++) {
            String str_x = String.valueOf(x);
            flag = true;
            for (char ch : str_x.toCharArray()) {
                int count = 0;
                for (char ch2 : str_x.toCharArray()) {
                    if (ch == ch2)
                        count++;
                }
                if (ch - 48 != count) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans = x;
                break;
            }
        }
        return ans;
    }
}