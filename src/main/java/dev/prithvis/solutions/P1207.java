package dev.prithvis.solutions;

import java.util.*;
import java.util.stream.Collectors;

public class P1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> freqMap=new HashMap<>();
        for(int num:arr){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        List<Integer> sortedOccurrence= freqMap.values().stream().sorted().toList();
        for (int i=0;i < sortedOccurrence.size()-1;i++){
            if(sortedOccurrence.get(i)==sortedOccurrence.get(i+1)){
                return  false;
            }
        }
        return true;
    }
}
