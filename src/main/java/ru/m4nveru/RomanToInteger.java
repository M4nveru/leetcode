package ru.m4nveru;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> romans = new HashMap<>();
        fillMap(romans);
        int result = romans.get(s.charAt(0));
        char prevCh = s.charAt(0);
        for (Character ch : s.substring(1).toCharArray()){
            if (romans.get(prevCh) < romans.get(ch)){
                result -= romans.get(prevCh);
                result += romans.get(ch) - romans.get(prevCh);
            } else {
                result += romans.get(ch);
            }
            prevCh = ch;
        }
        return result;
    }

    public static void fillMap(Map<Character, Integer> hashMap){
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
