package ru.m4nveru;

public class SortingTheSentence {
    public String sortSentence(String s) {
        String[] result = new String[9];
        for (String str : s.split(" ")) {
            result[Integer.parseInt(String.valueOf(str.charAt(str.length() - 1))) - 1] = str.substring(0, str.length() - 1);
        }
        StringBuilder sb = new StringBuilder();
        for (String str : result) {
            if (str == null) break;
            sb.append(str).append(" ");
        }
        return sb.substring(0, sb.length() - 1).toString();
    }
}
