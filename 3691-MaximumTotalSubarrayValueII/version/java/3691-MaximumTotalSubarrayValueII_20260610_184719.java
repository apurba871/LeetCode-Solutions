// Last updated: 6/10/2026, 6:47:19 PM
1class SegTree {
2
3    int[] maxv;
4    int[] minv;
5    int n;
6
7    SegTree(int[] nums) {
8        n = nums.length;
9        maxv = new int[n * 4];
10        minv = new int[n * 4];
11        build(1, 0, n - 1, nums);
12    }
13
14    void build(int node, int l, int r, int[] nums) {
15        if (l == r) {
16            maxv[node] = minv[node] = nums[l];
17            return;
18        }
19        int m = (l + r) / 2;
20        build(node * 2, l, m, nums);
21        build(node * 2 + 1, m + 1, r, nums);
22        maxv[node] = Math.max(maxv[node * 2], maxv[node * 2 + 1]);
23        minv[node] = Math.min(minv[node * 2], minv[node * 2 + 1]);
24    }
25
26    int queryMax(int node, int l, int r, int ql, int qr) {
27        if (ql <= l && r <= qr) {
28            return maxv[node];
29        }
30        int m = (l + r) / 2;
31        int res = Integer.MIN_VALUE;
32        if (ql <= m) {
33            res = Math.max(res, queryMax(node * 2, l, m, ql, qr));
34        }
35        if (qr > m) {
36            res = Math.max(res, queryMax(node * 2 + 1, m + 1, r, ql, qr));
37        }
38        return res;
39    }
40
41    int queryMin(int node, int l, int r, int ql, int qr) {
42        if (ql <= l && r <= qr) {
43            return minv[node];
44        }
45        int m = (l + r) / 2;
46        int res = Integer.MAX_VALUE;
47        if (ql <= m) {
48            res = Math.min(res, queryMin(node * 2, l, m, ql, qr));
49        }
50        if (qr > m) {
51            res = Math.min(res, queryMin(node * 2 + 1, m + 1, r, ql, qr));
52        }
53        return res;
54    }
55}
56
57class Solution {
58
59    public long maxTotalValue(int[] nums, int k) {
60        int n = nums.length;
61        SegTree seg = new SegTree(nums);
62        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
63        for (int l = 0; l < n; l++) {
64            pq.offer(
65                new int[] {
66                    seg.queryMax(1, 0, n - 1, l, n - 1) -
67                    seg.queryMin(1, 0, n - 1, l, n - 1),
68                    l,
69                    n - 1,
70                }
71            );
72        }
73        long ans = 0;
74        while (k-- > 0) {
75            int[] top = pq.poll();
76            ans += top[0];
77            int l = top[1];
78            int r = top[2];
79            if (r > l) {
80                pq.offer(
81                    new int[] {
82                        seg.queryMax(1, 0, n - 1, l, r - 1) -
83                        seg.queryMin(1, 0, n - 1, l, r - 1),
84                        l,
85                        r - 1,
86                    }
87                );
88            }
89        }
90        return ans;
91    }
92}