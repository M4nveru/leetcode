package ru.m4nveru;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        int i = 0;
        while (true){
            for (int j = 1; j < strs.length; j++){
                if (strs[j-1].length() <= i || strs[j].length() <= i || strs[j].charAt(i) != strs[j-1].charAt(i)){
                    return strs[j].substring(0, i);
                }
            }
            i += 1;
        }
    }
}
