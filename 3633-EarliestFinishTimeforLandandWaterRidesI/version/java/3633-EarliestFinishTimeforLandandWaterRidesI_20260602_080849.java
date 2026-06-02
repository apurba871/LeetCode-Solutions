// Last updated: 6/2/2026, 8:08:49 AM
1class Solution {
2    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
3        // Option 1: Do a land ride first, then a water ride
4        int landThenWater = solveOrder(landStartTime, landDuration, waterStartTime, waterDuration);
5        
6        // Option 2: Do a water ride first, then a land ride
7        int waterThenLand = solveOrder(waterStartTime, waterDuration, landStartTime, landDuration);
8        
9        // Return the best of both paths
10        return Math.min(landThenWater, waterThenLand);
11    }
12
13    private int solveOrder(int[] start1, int[] duration1, int[] start2, int[] duration2) {
14        // Step 1: Find the absolute earliest we can finish any ride in the first category
15        int minEnd1 = Integer.MAX_VALUE;
16        for (int i = 0; i < start1.length; i++) {
17            minEnd1 = Math.min(minEnd1, start1[i] + duration1[i]);
18        }
19        
20        // Step 2: Find the earliest we can finish the second category ride after that
21        int minTotalEnd = Integer.MAX_VALUE;
22        for (int j = 0; j < start2.length; j++) {
23            // We can start ride j either when it opens OR when we finish ride 1, whichever is LATER
24            int actualStart2 = Math.max(minEnd1, start2[j]);
25            int totalTime = actualStart2 + duration2[j];
26            
27            minTotalEnd = Math.min(minTotalEnd, totalTime);
28        }
29        
30        return minTotalEnd;
31    }
32}