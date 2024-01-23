package ru.m4nveru;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : s.toCharArray()){
            if (ch == '[' || ch == '(' || ch == '{') stack.push(ch);
            else if ((ch == ']' && !stack.empty() && stack.peek() != '[' || stack.empty())
                    || (ch == ')' && !stack.empty() &&  stack.peek() != '(' || stack.empty())
                    || (ch == '}' && !stack.empty() && stack.peek() != '{' || stack.empty()))
                return false;
            else stack.pop();
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }
}
