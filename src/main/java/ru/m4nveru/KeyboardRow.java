package ru.m4nveru;

import java.util.*;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        int it = 0, row = -1, res = 0, iter = 0;
        Set<Character> firstRow = new HashSet<>(List.of(new Character[]{'q','w','e','r','t','y','u','i','o','p'}));
        Set<Character> secondRow = new HashSet<>(List.of(new Character[]{'a','s','d','f','g','h','j','k','l'}));
        Set<Character> thirdRow = new HashSet<>(List.of(new Character[]{'z','x','c','v','b','n','m'}));
        for (String word : words){
            res = 0;
            word = word.toLowerCase();
            if (firstRow.contains(word.charAt(0))) row = 1;
            else if (secondRow.contains(word.charAt(0))) row = 2;
            else row = 3;
            for (char ch : word.toCharArray()){
                switch (row){
                    case 1 -> {
                        if (!firstRow.contains(ch)) res = -1;
                    }
                    case 2 -> {
                        if (!secondRow.contains(ch)) res = -1;
                    }
                    case 3 -> {
                        if (!thirdRow.contains(ch)) res = -1;
                    }
                }
            }
            if (res != -1) {
                result.add(words[iter]);
                it++;
            }
            iter++;
        }
        String[] arr = result.toArray(new String[0]);
        return arr;
    }
}
