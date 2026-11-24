// Last updated: 11/24/2026, 11:47:27 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        // Set<Integer> set = new TreeSet<>();
4        // for (int i = 0; i < nums.length; ++i) {
5        //     set.add(nums[i]);
6        // }
7        // int uniqueElements = set.size();
8        // int index = 0;
9        // for (int element : set) {
10        //     nums[index++] = element;
11        // }
12        // return uniqueElements;
13
14        // int x = nums[0];
15        // int uniqueElements = 1;
16        // int index = 1;
17        // for (int i = 1; i < nums.length; ++i) {
18        //     if (nums[i] != x) {
19        //         x = nums[i];
20        //         nums[index++] = x;
21        //         uniqueElements++;
22        //     }
23        // }
24        // return uniqueElements;
25
26        int i = 0;
27        for (int j = 1; j < nums.length; ++j) {
28            if (nums[j] != nums[i]) {
29                nums[i + 1] = nums[j];
30                i++;
31            }
32        }
33        return i + 1;
34        
35        // int l = 0, ans = 1;
36        // for (int i = 1; i < nums.length; ++i) {
37        //     if (nums[l] != nums[i]) {
38        //         l++;
39        //         nums[l] = nums[i];
40        //         ans++;
41        //     }
42        // }
43        // return ans;
44    }
45}