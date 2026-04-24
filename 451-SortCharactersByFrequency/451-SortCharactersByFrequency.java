// Last updated: 4/24/2026, 8:14:28 AM
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new TreeMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        String ans = "";
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        for (var it : list) {
            ans += it.getKey().toString().repeat(it.getValue());
        }
        return ans;
    }
}