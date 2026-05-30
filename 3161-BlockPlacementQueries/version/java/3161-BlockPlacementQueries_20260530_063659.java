// Last updated: 5/30/2026, 6:36:59 AM
1class Solution {
2    int[] bit = new int[50001];
3
4    public List<Boolean> getResults(int[][] queries) {
5        List<Boolean> res = new LinkedList<>();
6        TreeSet<Integer> blocks = new TreeSet<>();
7        blocks.add(0);      // keep 0 as leftside boundary
8
9        for (int[] query: queries) {
10            if (query[0] == 1) blocks.add(query[1]);
11        }
12
13        // calculate each blocks gap: between [block_k, block_k+1]
14        Iterator<Integer> it = blocks.iterator();
15        Integer prev = it.next();
16        while (it.hasNext()) {
17            Integer next = it.next();
18            update(next, next - prev);
19            prev = next;
20        }
21
22        // iterate from the end to start
23        for (int i = queries.length - 1; i >= 0; i--) {
24            int type = queries[i][0], x = queries[i][1], sz = type == 1? 0: queries[i][2];
25            
26            if (type == 1) {
27                if (blocks.higher(x) != null && blocks.lower(x) != null) {
28                    update(blocks.higher(x), blocks.higher(x) - blocks.lower(x));
29                }
30                blocks.remove(x);
31            } else {
32                res.add(
33                    (blocks.lower(x) != null && x - blocks.lower(x) >= sz)
34                    || getMax(x) >= sz
35                );
36            }
37        }
38        return res.reversed();
39    }
40
41    private void update(int idx, int val) {
42        for (; idx < 50001; idx = idx | (idx + 1)) {
43            bit[idx] = Math.max(bit[idx], val);
44        }
45    }
46
47    private int getMax(int r) {
48        int ret = 0;
49        for (; r >= 0; r = (r & (r + 1)) - 1) {
50            ret = Math.max(ret, bit[r]);
51        }
52        return ret;
53    }
54}