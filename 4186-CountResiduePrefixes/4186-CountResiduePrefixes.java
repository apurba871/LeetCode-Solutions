// Last updated: 4/24/2026, 8:12:59 AM
class Solution {
    public int residuePrefixes(String s) {
        String str = "";
        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            str += ch;
            Map<Character, Integer> map = new HashMap<>();
            for (char letter : str.toCharArray()) {
                map.put(letter, map.getOrDefault(letter, 0) + 1);
            }
            if (map.size() == str.length() % 3)
                ans++;
        }
        return ans;
    }
}