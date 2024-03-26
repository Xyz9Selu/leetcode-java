package com.leetcode.m208_trie;

import org.junit.Test;
import org.junit.Assert;

public class TrieTest {
    @Test
    public void trieTest() {
        Trie trie = new Trie();

        trie.insert("apple");
        Assert.assertTrue(trie.search("apple"));
        Assert.assertFalse(trie.search("app"));
        Assert.assertTrue(trie.startsWith("app"));
        trie.insert("app");
        Assert.assertTrue(trie.search("app"));
    }
}