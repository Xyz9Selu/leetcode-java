package com.leetcode.m1268_suggested_products;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie trie = new Trie();
        for (String p: products) {
            insert(trie, p);
        }

        List<List<String>> result = new ArrayList<>();
        Trie curr = trie;
        
        StringBuilder sb = new StringBuilder();
        for (char c: searchWord.toCharArray()) {
            sb.append(c);
            Trie node = curr != null? curr.children[c - 'a']: null;
            List<String> sug = new ArrayList<>();
            suggest(node, sb, sug);
            result.add(sug);

            curr = node;
        }
        
        return result;
    }

    private void suggest(Trie root, StringBuilder word, List<String> result) {
        if (root == null || result.size() >= 3) {
            return;
        }

        if (root.isEnd) {
            result.add(word.toString());
        }

        for (int idx = 0; idx < root.children.length; idx ++) {
            if (root.children[idx] == null) {
                continue;
            }

            word.append((char)(idx + 'a'));
            suggest(root.children[idx], word, result);
            word.deleteCharAt(word.length() - 1);
        }
    }

    private void insert(Trie trie, String word) {
        Trie curr = trie;

        for (char c: word.toCharArray()) {
            int idx = c - 'a';
            Trie node = curr.children[idx];
            if (node == null) {
                node = new Trie();
                curr.children[idx] = node;
            }

            curr = node;
        }

        curr.isEnd = true;
    }

}

class Trie {
    Trie[] children;
    boolean isEnd;

    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }
}