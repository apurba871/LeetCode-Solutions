// Last updated: 7/11/2026, 8:50:05 PM
1public class Solution {
2
3    public int countCompleteComponents(int n, int[][] edges) {
4        // Adjacency lists for each vertex
5        List<Integer>[] graph = new ArrayList[n];
6        // Map to store frequency of each unique adjacency list
7        Map<List<Integer>, Integer> componentFreq = new HashMap<>();
8
9        // Initialize adjacency lists with self-loops
10        for (int vertex = 0; vertex < n; vertex++) {
11            graph[vertex] = new ArrayList<>();
12            graph[vertex].add(vertex);
13        }
14
15        // Build adjacency lists from edges
16        for (int[] edge : edges) {
17            graph[edge[0]].add(edge[1]);
18            graph[edge[1]].add(edge[0]);
19        }
20
21        // Count frequency of each unique adjacency pattern
22        for (int vertex = 0; vertex < n; vertex++) {
23            List<Integer> neighbors = graph[vertex];
24            Collections.sort(neighbors);
25            componentFreq.put(
26                neighbors,
27                componentFreq.getOrDefault(neighbors, 0) + 1
28            );
29        }
30
31        // Count complete components where size equals frequency
32        int completeCount = 0;
33        for (Map.Entry<
34            List<Integer>,
35            Integer
36        > entry : componentFreq.entrySet()) {
37            if (entry.getKey().size() == entry.getValue()) {
38                completeCount++;
39            }
40        }
41
42        return completeCount;
43    }
44}