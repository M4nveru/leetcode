package ru.m4nveru;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int count = 2, len = s.length(), curLen;
        String pattern;
        while (len == count || len / count > 0){
            if (len % count != 0) {
                count++;
                continue;
            }
            curLen = len / count;
            pattern = s.substring(0, curLen);
            for(int i = 0; i < len; i += curLen){
                if (!s.substring(i, i + curLen).equals(pattern)) break;
                if (i == len - curLen && s.substring(i, i + curLen).equals(pattern)){
                    return true;
                }
            }
            count++;
        }
        return false;
    }
}
