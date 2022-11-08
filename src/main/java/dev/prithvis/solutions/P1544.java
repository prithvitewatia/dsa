package dev.prithvis.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Character.*;

public class P1544 {
    public String makeGood(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (deque.isEmpty()) {
                deque.push(s.charAt(i));
            } else if (badAdjacentChars(deque.getLast(), s.charAt(i))) {
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

    private boolean badAdjacentChars(Character peek, char currentChar) {
        return (toLowerCase(peek)==toLowerCase(currentChar)) &&
                ((isUpperCase(peek) && isLowerCase(currentChar))||
                (isLowerCase(peek) && isUpperCase(currentChar)));
    }
}
