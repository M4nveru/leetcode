package ru.m4nveru;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    // можно и попроще, как оказалось, но уже переделывать не буду
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> chars = new HashMap<>();
        for (char ch : s.toCharArray()){
            chars.put(ch, chars.getOrDefault(ch, 0) + 1);
        }
        int val;
        for (char ch : s.toCharArray()){
            if (!chars.containsKey(ch)){
                return false;
            }
            val = chars.get(ch);
            if (val > 1){
                chars.put(ch, val - 1);
            } else {
                chars.remove(ch);
            }
        }
        return chars.isEmpty();
    }
}
