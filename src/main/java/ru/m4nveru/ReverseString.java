package ru.m4nveru;

public class ReverseString {
    public void reverseString(char[] s) {
        int lPointer = 0, rPointer = s.length - 1;
        char temp;
        while (lPointer < rPointer){
            temp = s[lPointer];
            s[lPointer] = s[rPointer];
            s[rPointer] = temp;
            lPointer++;
            rPointer--;
        }
    }
}
