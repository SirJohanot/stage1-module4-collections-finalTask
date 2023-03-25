package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        return projects.entrySet()
                .stream()
                .filter(e -> e.getValue().contains(developer))
                .map(Map.Entry::getKey)
                .sorted(this::comparator)
                .collect(Collectors.toList());
    }

    private int comparator(String a, String b) {
        int lengthDiff = b.length() - a.length();
        if (lengthDiff != 0) {
            return lengthDiff;
        }
        return -a.compareTo(b);
    }
}
