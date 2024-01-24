package ru.m4nveru;

public class FirstOccurrence {
    public int strStr(String haystack, String needle) {
        char[] chars = needle.toCharArray();
        char[] input = haystack.toCharArray();
        int param = 0;
        for (int i = 0; i< input.length; i++){
            if (param == chars.length-1 && input[i] == chars[param]){
                return i - param;
            } else if (input[i] == chars[param]){
                param++;
            } else {
                i -= param;
                param = 0;
            }
        }
        return -1;
    }
}
