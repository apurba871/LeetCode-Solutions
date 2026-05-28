// Last updated: 5/28/2026, 7:53:26 AM
1class Solution {
2    class TrieNode {
3        int idx;
4        TrieNode[] children;
5    }
6    TrieNode getNode(int i) {
7        TrieNode temp = new TrieNode();
8        temp.idx = i;
9        temp.children = new TrieNode[26];
10        return temp;
11    }
12    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
13        int m = wordsContainer.length;
14        int n = wordsQuery.length;
15        int[] result = new int[n];
16        TrieNode root = getNode(0);
17
18        for (int i = 0; i < m; ++i) {
19            int idx = root.idx;
20            if (wordsContainer[idx].length() > wordsContainer[i].length())
21                root.idx = i;
22            insertTrie(root, i, wordsContainer);
23        }
24
25        for (int i = 0; i < n; ++i) {
26            result[i] = searchTrie(root, wordsQuery[i]);
27        }
28        return result;
29    }
30    public void insertTrie(TrieNode root, int i, String[] wordsContainer) {
31        String word = wordsContainer[i];
32        String revWord = new StringBuilder(word).reverse().toString();
33        for (int j = 0; j < revWord.length(); ++j) {
34            char ch = revWord.charAt(j);
35            int chIdx = ch - 'a';
36            if (root.children[chIdx] == null)
37                root.children[chIdx] = getNode(i);
38            root = root.children[chIdx];
39            if (wordsContainer[root.idx].length() > word.length())
40                root.idx = i;
41        }
42    }
43    public int searchTrie(TrieNode root, String query) {
44        int resIdx = root.idx;
45        int n = query.length();
46        for (int i = n - 1; i >= 0; --i) {
47            int chIdx = query.charAt(i) - 'a';
48            root = root.children[chIdx];
49            if (root == null)
50                return resIdx;
51            resIdx = root.idx;
52        }
53        return resIdx;
54    }
55}