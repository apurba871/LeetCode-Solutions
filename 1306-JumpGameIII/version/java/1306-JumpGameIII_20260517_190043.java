// Last updated: 5/17/2026, 7:00:43 PM
1class Solution {
2    //int[] visited = new int[(int)1e7 + 1];
3
4    public boolean canReach(int[] arr, int start) {
5        //visited[start] = 1;
6        //System.out.println("arr[start]: " + arr[start]);
7        if (start < 0 || start >= arr.length || arr[start] < 0)
8            return false;
9        if (arr[start] == 0)
10            return true;
11        arr[start] *= -1;
12        int x = start + arr[start]; 
13        int y = start - arr[start]; 
14        boolean left = canReach(arr, x);
15        boolean right = canReach(arr, y);
16        return left || right;
17    }
18}