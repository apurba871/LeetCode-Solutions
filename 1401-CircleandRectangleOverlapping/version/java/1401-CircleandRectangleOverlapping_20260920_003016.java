// Last updated: 9/20/2026, 12:30:16 AM
1class Solution {
2    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
3        int px = xCenter;
4        int py = yCenter;
5        if (xCenter < x1)
6            px = x1;
7        else if (xCenter > x2)
8            px = x2;
9        if (yCenter < y1)
10            py = y1;
11        else if (yCenter > y2)
12            py = y2;
13        int dx = px - xCenter;
14        int dy = py - yCenter;
15        return dx * dx + dy * dy <= radius * radius;
16    }
17}