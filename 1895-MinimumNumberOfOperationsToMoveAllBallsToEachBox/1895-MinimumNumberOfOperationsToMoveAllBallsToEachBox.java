// Last updated: 4/24/2026, 8:13:40 AM
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int ans[] = new int[n];
        int idx = -1;
        for (int i = 0; i < n; ++i) { 
            int count = 0;
            idx++;
            //System.out.println("idx: " + idx);
            for (int j = 0; j < n; ++j) {
                //System.out.println("idx: " + idx + " j: " + j);
                if (j != idx && boxes.charAt(j) == '1') {
                    
                    count += Math.abs(idx - j);
                }
            }
            ans[idx] = count;
        }
        return ans;
    }
}