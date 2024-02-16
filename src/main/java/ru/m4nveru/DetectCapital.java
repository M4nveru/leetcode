package ru.m4nveru;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        boolean firstIsUpper = false, secondIsUpper = false;
        if (word.length() == 1) return true;
        if (Character.isUpperCase(word.charAt(0))) firstIsUpper = true;
        if (Character.isUpperCase(word.charAt(1))) secondIsUpper = true;
        if (!firstIsUpper && secondIsUpper) return false;
        else{
            for (char ch : word.substring(2).toCharArray()){
                if (firstIsUpper && !secondIsUpper && Character.isUpperCase(ch)) return false;
                else if (firstIsUpper && secondIsUpper && Character.isLowerCase(ch)) return false;
                else if (!firstIsUpper && !secondIsUpper && Character.isUpperCase(ch)) return false;
            }
        }
        return true;
    }
}
