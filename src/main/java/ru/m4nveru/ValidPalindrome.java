package ru.m4nveru;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();
        int lPointer = 0,  rPointer = s.length() - 1;
        char[] chars = s.toCharArray();
        if (chars.length == 1){
            return true;
        }
        while (lPointer != rPointer){
            if (rPointer == lPointer - 1){
                break;
            }
            if (chars[rPointer] != chars[lPointer]){
                return false;
            }
            rPointer--;
            lPointer++;
        }
        return true;
    }
}
