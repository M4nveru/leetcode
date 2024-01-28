package ru.m4nveru;

public class MergeStringAlternately {
    public String mergeAlternately(String word1, String word2) {
        int fw = 0, sw = 0;
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        StringBuilder result = new StringBuilder();
        while (fw != w1.length && sw != w2.length){
            if (fw == w1.length - 1){
                result.append(w1[fw]).append(word2.substring(sw, word2.length()));
                break;
            } else if (sw == w2.length - 1){
                result.append(w1[fw]).append(w2[sw]).append(word1.substring(fw + 1, word2.length()));
                break;
            } else {
                result.append(w1[fw]).append(w2[sw]);
            }
            fw++;
            sw++;
        }
        if (fw != w1.length){
            result.append(word1.substring(fw+1, w1.length));
        } else if (sw != w2.length){
            result.append(word2.substring(sw+1, w2.length));
        }
        return result.toString();
    }
}
