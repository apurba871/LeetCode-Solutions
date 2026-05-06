// Last updated: 5/6/2026, 6:49:08 AM
1class Solution {
2    public char[][] rotateTheBox(char[][] box) {
3        int rows = box.length;
4        int cols = box[0].length;
5
6        // 1. Apply Gravity horizontally (right side is the new "bottom")
7        for (int i = 0; i < rows; i++) {
8            // This pointer tracks the next available empty slot from the right
9            int emptySlot = cols - 1; 
10            
11            for (int j = cols - 1; j >= 0; j--) {
12                if (box[i][j] == '*') {
13                    // Obstacle! The next stone must stop before this
14                    emptySlot = j - 1;
15                } else if (box[i][j] == '#') {
16                    // Move stone to the furthest available empty slot
17                    char temp = box[i][j];
18                    box[i][j] = '.';
19                    box[i][emptySlot] = temp;
20                    emptySlot--;
21                }
22            }
23        }
24
25        // 2. Rotate 90 degrees clockwise
26        char[][] res = new char[cols][rows];
27        for (int r = 0; r < rows; r++) {
28            for (int c = 0; c < cols; c++) {
29                // The formula for 90-deg clockwise rotation:
30                res[c][rows - 1 - r] = box[r][c];
31            }
32        }
33
34        return res;
35    }
36}