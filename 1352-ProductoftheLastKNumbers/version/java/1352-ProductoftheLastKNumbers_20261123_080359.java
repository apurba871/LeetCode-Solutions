// Last updated: 11/23/2026, 8:03:59 AM
1class ProductOfNumbers {
2    List<Integer> stream;
3    public ProductOfNumbers() {
4        stream = new ArrayList<>();
5    }
6    
7    public void add(int num) {
8        stream.add(num);
9    }
10    
11    public int getProduct(int k) {
12        int sz = stream.size();
13        int res = 1;
14        for (int i = sz - 1; k > 0; i--, k--) {
15            res *= stream.get(i);
16        }
17        return res;
18    }
19}
20
21/**
22 * Your ProductOfNumbers object will be instantiated and called as such:
23 * ProductOfNumbers obj = new ProductOfNumbers();
24 * obj.add(num);
25 * int param_2 = obj.getProduct(k);
26 */