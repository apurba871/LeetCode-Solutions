// Last updated: 4/24/2026, 8:13:00 AM
class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int[] ans = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        int maxq = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 0; i < towers.length; ++i) {
            //find distance of this point from the center
            int dist = Math.abs(towers[i][0] - center[0]) + Math.abs(towers[i][1] - center[1]);
            if (dist <= radius) {
                if (maxq == towers[i][2]) {
                    //System.out.println("inside: " + towers[i][0] + " " + towers[i][1]);
                    if (towers[i][0] < ans[0] || towers[i][0] == ans[0] && towers[i][1] < ans[1]) {
                        //System.out.println("inside: " + towers[i][0] + " " + towers[i][1]);
                        ans = new int[] {towers[i][0], towers[i][1]};
                    }
                } else if (maxq < towers[i][2]){
                    maxq = towers[i][2];
                    //System.out.println(maxq);
                    ans = new int[] {towers[i][0], towers[i][1]};
                }
                flag = true;
            }
        }
        return flag ? ans : new int[] {-1, -1};
    }
}