// Last updated: 5/31/2026, 6:47:25 AM
1class Solution {
2    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
3        Arrays.sort(asteroids);
4        boolean flag = true;
5        long currMass = mass;
6        for (int asteroid : asteroids) {
7            if (currMass >= asteroid) {
8                currMass += asteroid;
9            } else {
10                flag = false;
11                break;
12            }
13        }
14        return flag;
15    }
16}