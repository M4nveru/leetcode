package ru.m4nveru;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 1){
            return 1;
        }
        int length = 0;
        for (int i = chars.length-1; i >= 0; i--){
            if (length == 0){
                if (chars[i] != ' '){
                    length++;
                }
            } else if (chars[i] == ' ') break;
            else length++;
        }
        return length;
    }
}
