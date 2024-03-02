package com.leetcode.m399_calc_equation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // convert to map
        Map<String, Map<String, Double>> dirgram = new HashMap<>();
        for (int i = 0; i < equations.size(); i ++) {
            List<String> eq = equations.get(i);
            double val = values[i];
            String p1 = eq.get(0);
            String p2 = eq.get(1);
            Map<String, Double> rel1 = dirgram.getOrDefault(p1, new HashMap<>());
            Map<String, Double> rel2 = dirgram.getOrDefault(p2, new HashMap<>());
            rel1.put(p2, val);
            rel2.put(p1, 1 / val);
            dirgram.put(p1, rel1);
            dirgram.put(p2, rel2);
        }

        // triverse map to find each answer
        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i ++) {
            Set<String> visited = new HashSet<>();
            List<String> q = queries.get(i);
            result[i] = dfs(q.get(0), q.get(1), dirgram, visited);
        }

        return result;
    }

    private double dfs(String src, String dst, Map<String, Map<String, Double>> graph, Set<String> visited) {
        // return -1.0 if src not exist in diagram
        if (!graph.containsKey(src)) {
            return -1.0;
        }

        visited.add(src);
        
        Map<String, Double> relations = graph.get(src);
        
        // return value directly if dst has relationship with src
        if (relations.containsKey(dst)) {
            return relations.get(dst);
        }
        
        // triverse neighbours
        for (Map.Entry<String, Double> entry : relations.entrySet()) {
            String k = entry.getKey();

            // if not visited
            if (!visited.contains(k)) {
                double weight = dfs(k, dst, graph, visited);

                if (weight != -1.0) {
                    return entry.getValue() * weight;
                }
            }
        }

        // no valid dst found, return -1
        return -1.0;
    }
}
