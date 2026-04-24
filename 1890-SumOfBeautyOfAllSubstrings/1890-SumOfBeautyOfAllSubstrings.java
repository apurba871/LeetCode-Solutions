// Last updated: 4/24/2026, 8:13:41 AM
class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];

            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                freq[ch - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;

                for (int f : freq) {
                    if (f > 0) {
                        max = Math.max(max, f);
                        min = Math.min(min, f);
                    }
                }

                count += (max - min);
            }
        }

        return count;
    }
}