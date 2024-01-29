package ru.m4nveru;

import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch != '#'){
                sStack.push(ch);
            } else {
                if (!sStack.isEmpty()) sStack.pop();
            }
        }
        for (char ch : t.toCharArray()){
            if (ch != '#'){
                tStack.push(ch);
            } else {
                if (!tStack.isEmpty()) tStack.pop();
            }
        }
        return sStack.equals(tStack);
    }
}
