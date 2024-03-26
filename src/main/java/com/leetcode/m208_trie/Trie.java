package com.leetcode.m208_trie;

class Trie {
    private Trie[] children;
    private boolean isEnd;

    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }
    
    public void insert(String word) {
        Trie curr = this;

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

    private Trie searchTree(String word) {
        Trie curr = this;

        for (char c: word.toCharArray()) {
            if (curr == null) {
                break;
            }

            Trie node = curr.children[c - 'a'];
            curr = node;
        }

        return curr;
    }
    
    public boolean search(String word) {
        Trie node = searchTree(word);
        return node != null && node.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        Trie node = searchTree(prefix);
        return node != null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */