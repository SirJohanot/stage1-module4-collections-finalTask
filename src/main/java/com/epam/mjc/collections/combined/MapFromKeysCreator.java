package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        for (String s : sourceMap.keySet()) {
            int length = s.length();
            if (result.containsKey(length)) {
                result.get(length).add(s);
            } else {
                result.put(length, new HashSet<>(List.of(s)));
            }
        }
        return result;
    }
}
