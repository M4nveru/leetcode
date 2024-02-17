package ru.m4nveru;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        char[] tChars = t.toCharArray();
        int it = 0;
        for (char ch : s.toCharArray()){
            if (map.containsKey(ch)){
                if (map.get(ch) != tChars[it]){
                    return false;
                }
            } else if (map.containsValue(tChars[it])) {
                return false;
            } else {
                map.put(ch, tChars[it]);
            }
            it++;
        }
        return true;
    }
}
