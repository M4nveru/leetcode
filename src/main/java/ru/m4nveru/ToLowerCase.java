package ru.m4nveru;

public class ToLowerCase {
    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (chars[i] < 91 && chars[i] > 64){
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
}
