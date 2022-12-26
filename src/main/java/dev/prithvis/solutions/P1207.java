package dev.prithvis.solutions;

import java.util.*;

public class P1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        Collection<Integer> mapValues = freqMap.values();
        Set<Integer> uniqueValues = new HashSet<>(mapValues);
        return mapValues.size() == uniqueValues.size();
    }
}
