// Last updated: 4/24/2026, 8:15:24 AM
class Solution {
    public int romanToInt(String s) {
        int val = 0;
        for (int i = 0; i < s.length(); ++i) {
          char ch = s.charAt(i);
          if (ch == 'M') val += 1000;
          else if (ch == 'D') val += 500;
          else if (ch == 'C' && (i + 1) < s.length() && s.charAt(i + 1) == 'D') { val += 400; i++; }
          else if (ch == 'C' && (i + 1) < s.length() && s.charAt(i + 1) == 'M') { val += 900; i++; }
          else if (ch == 'C') val += 100;
          else if (ch == 'L') val += 50;
          else if (ch == 'X' && (i + 1) < s.length() && s.charAt(i + 1) == 'L') { val += 40; i++; }
          else if (ch == 'X' && (i + 1) < s.length() && s.charAt(i + 1) == 'C') { val += 90; i++; }
          else if (ch == 'X') val += 10;
          else if (ch == 'V') val += 5;
          else if (ch == 'I' && (i + 1) < s.length() && s.charAt(i + 1) == 'V') { val += 4; i++; }
          else if (ch == 'I' && (i + 1) < s.length() && s.charAt(i + 1) == 'X') { val += 9; i++; }
          else if (ch == 'I') val++;
        }
        return val;
    }
}