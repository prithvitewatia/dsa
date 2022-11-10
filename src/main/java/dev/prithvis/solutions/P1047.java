package dev.prithvis.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

public class P1047 {
    public String removeDuplicates(String s){
        Deque<Character> deque=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(deque.isEmpty()){
                deque.add(s.charAt(i));
            }
            else if(duplicateAdjacentChars(deque.getLast(),s.charAt(i))){
                deque.removeLast();
            }
            else{
                deque.add(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:deque){
            sb.append(c);
        }
        return sb.toString();
    }

    private boolean duplicateAdjacentChars(Character top, char currentChar) {
        return top==currentChar;
    }
}
