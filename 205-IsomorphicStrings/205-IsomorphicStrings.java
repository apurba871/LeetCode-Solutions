// Last updated: 4/24/2026, 8:14:44 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if (map.get(ss) == null)
                map.put(ss, tt);
            else {
                if (map.get(ss) != tt)
                    return false;
            }
        }
        int sz = map.size();
        Set<Character> set = new HashSet<>();
        for (var it : map.values())
            set.add(it);
        return set.size() == sz;
    }
}