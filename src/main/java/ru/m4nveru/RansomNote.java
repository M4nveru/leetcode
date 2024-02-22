package ru.m4nveru;

import java.util.HashMap;

public class RansomNote {
//    public boolean canConstruct(String ransomNote, String magazine) {
//        var map = new HashMap<Character, Integer>();
//        int val;
//        for (char ch : magazine.toCharArray()){
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//        for (char ch : ransomNote.toCharArray()){
//            if (!map.containsKey(ch)){
//                return false;
//            } else {
//                val = map.get(ch);
//                if (val == 1){
//                    map.remove(ch);
//                } else {
//                    map.put(ch, map.get(ch) - 1);
//                }
//            }
//        }
//        return true;
//    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alph = new int[26];
        for (char ch : magazine.toCharArray()){
            alph[ch - 'a']++;
        }
        for (char ch : ransomNote.toCharArray()){
            if (alph[ch - 'a'] == 0){
                return false;
            }
            alph[ch - 'a']--;
        }
        return true;
    }
}
