package ru.m4nveru;

import java.util.Hashtable;
import java.util.Set;

import static java.lang.Math.abs;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for (char ch : s.toCharArray()){
            res -= ch;
        }
        for (char ch : t.toCharArray()){
            res += ch;
        }
        return res;
    }
}
