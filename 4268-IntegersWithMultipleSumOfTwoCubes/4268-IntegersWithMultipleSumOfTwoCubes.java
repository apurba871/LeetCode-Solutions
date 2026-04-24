// Last updated: 4/24/2026, 8:12:57 AM
class Solution {
    public List<Integer> findGoodIntegers(int n) {
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        int limit = (int)Math.cbrt(n);

        for (int a = 1; a <= limit; a++) {
            int a3 = a * a * a;

            for (int b = a; b <= limit; b++) {
                int sum = a3 + b * b * b;

                if (sum > n) break;

                mp.put(sum, mp.getOrDefault(sum, 0) + 1);
            }
        }

        for (int key : mp.keySet()) {
            if (mp.get(key) > 1) {
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}