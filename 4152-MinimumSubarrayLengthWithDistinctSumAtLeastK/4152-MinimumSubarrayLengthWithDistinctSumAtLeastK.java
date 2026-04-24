// Last updated: 4/24/2026, 8:13:05 AM
class Solution {
    public int minLength(int[] nums, int k) {
        int[] myArr = nums;

        int n = myArr.length;
        int[] freq = new int[100001];

        long distinctSum = 0;
        int left = 0;
        int answer = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            int val = myArr[right];
            if (freq[val] == 0) {
                distinctSum += val;
            }
            freq[val]++;

            while (distinctSum >= k) {
                answer = Math.min(answer, right - left + 1);

                int leftVal = myArr[left];
                freq[leftVal]--;
                if (freq[leftVal] == 0) {
                    distinctSum -= leftVal;
                }
                left++;
            }
        }

        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
}
