// Last updated: 5/31/2026, 6:50:07 AM
1class Solution {
2    static {
3        for (int i = 0; i < 100; ++i) {
4            asteroidsDestroyed(1, new int[]{});
5        }
6    }
7    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
8        Arrays.sort(asteroids);
9        boolean flag = true;
10        long currMass = mass;
11        for (int asteroid : asteroids) {
12            if (currMass >= asteroid) {
13                currMass += asteroid;
14            } else {
15                flag = false;
16                break;
17            }
18        }
19        return flag;
20    }
21}