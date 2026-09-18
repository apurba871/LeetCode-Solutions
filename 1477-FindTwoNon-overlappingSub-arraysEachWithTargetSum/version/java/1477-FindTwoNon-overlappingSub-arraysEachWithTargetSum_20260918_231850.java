// Last updated: 9/18/2026, 11:18:50 PM
1class Solution {
2    public int minSumOfLengths(int[] arr, int target) {
3        int n = arr.length;
4        int i = 0, j = 0;
5        int currSum = 0;
6        List<Integer> minBestLenTillIdx = new ArrayList<>(Collections.nCopies(n, Integer.MAX_VALUE));
7
8        int minBestLen = Integer.MAX_VALUE;
9        int result = Integer.MAX_VALUE;
10        while (j < n) {
11            currSum += arr[j];
12            while (i < j && currSum > target) {
13                currSum -= arr[i++];
14            }
15            if (currSum == target) {
16                int len = j - i + 1;
17                if (i > 0 && minBestLenTillIdx.get(i - 1) != Integer.MAX_VALUE) {
18                    result = Math.min(result, len + minBestLenTillIdx.get(i - 1));
19                }
20                minBestLen = Math.min(minBestLen, len);
21            }
22            minBestLenTillIdx.set(j, minBestLen);
23            j++;
24        }
25        return result == Integer.MAX_VALUE ? -1 : result;
26    }
27}