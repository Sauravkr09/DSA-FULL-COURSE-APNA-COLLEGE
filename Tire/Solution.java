import java.util.*;

public class Solution {
    // Inner TrieNode class
    static class TrieNode {
        List<String> data;
        TrieNode[] children;
        boolean isEnd;

        TrieNode() {
            data = new ArrayList<>();
            children = new TrieNode[26];
            isEnd = false;
        }
    }

    static TrieNode root;
    List<List<String>> ans;

    public List<List<String>> groupAnagrams(String[] strs) {
        ans = new ArrayList<>();
        root = new TrieNode();

        for (String word : strs) {
            build(word);
        }

        dfs(root);
        return ans;
    }

    // Builds the Trie with sorted characters of each word as the path
    public void build(String s) {
        TrieNode temp = root;
        char[] word = s.toCharArray();
        Arrays.sort(word);

        for (char c : word) {
            int idx = c - 'a';
            if (temp.children[idx] == null) {
                temp.children[idx] = new TrieNode();
            }
            temp = temp.children[idx];
        }

        temp.isEnd = true;
        temp.data.add(s);
    }

    // Depth-first search to collect all anagram groups
    public void dfs(TrieNode rt) {
        if (rt.isEnd) {
            ans.add(rt.data);
        }

        for (int i = 0; i < 26; i++) {
            if (rt.children[i] != null) {
                dfs(rt.children[i]);
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> groupedAnagrams = sol.groupAnagrams(words);
        System.out.println(groupedAnagrams);
    }
}
