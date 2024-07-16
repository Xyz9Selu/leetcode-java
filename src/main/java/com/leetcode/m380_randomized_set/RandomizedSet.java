package com.leetcode.m380_randomized_set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class RandomizedSet {
    private Random random;
    private Map<Integer, Integer> map;
    private List<Integer> list;

    public RandomizedSet() {
        random = new Random();
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }

        return false;
    }
    
    public boolean remove(int val) {
        if (map.containsKey(val)) {
            
            int idx = map.get(val);
            int lastVal = list.getLast();

            list.set(idx, lastVal);
            map.put(lastVal, idx);

            list.removeLast();
            map.remove(val);

            return true;
        }

        return false;
    }
    
    public int getRandom() {
        int randIndex = random.nextInt(list.size());
        return list.get(randIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */