// Last updated: 5/18/2026, 7:58:47 PM
1class Solution {
2    public int minJumps(int[] arr) {
3        int n = arr.length;
4        if (n == 1)
5            return 0;
6        Map<Integer, List<Integer>> mp = new HashMap<>();
7        for (int i = 0; i < n; ++i) {
8            mp.computeIfAbsent(arr[i], x -> new ArrayList<>()).add(i);
9        }
10        int[] visited = new int[n];
11        Queue<Integer> que = new LinkedList<>();
12        que.offer(0);
13        visited[0] = 1;
14        int steps = 0;
15        while (!que.isEmpty()) { 
16            int sz = que.size();
17            
18            while (sz-- > 0) {
19                int curr = que.poll();
20                if (curr == n - 1)
21                    return steps;
22                int left = curr - 1;
23                int right = curr + 1;
24                if (left >= 0 && visited[left] == 0) {
25                    que.offer(left);
26                    visited[left] = 1;
27                }
28                if (right <= n - 1 && visited[right] == 0) {
29                    que.offer(right);
30                    visited[right] = 1;
31                }
32                if (mp.containsKey(arr[curr])) {
33                    List<Integer> possibleIdx = mp.get(arr[curr]);
34                    for (int idx : possibleIdx) {
35                        // if (idx == n - 1)
36                        //     return steps;
37                        if (visited[idx] == 0) {
38                            que.offer(idx);
39                            visited[idx] = 1;
40                        }
41                    }
42                    mp.remove(arr[curr]);
43                }
44                
45            }
46            steps++;
47        }
48        return steps;
49    }
50}