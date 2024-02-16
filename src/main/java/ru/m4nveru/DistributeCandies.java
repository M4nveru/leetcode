package ru.m4nveru;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> candyTypes = new HashSet<>();
        for (int candy : candyType){
            candyTypes.add(candy);
        }
        return Math.min(candyType.length / 2, candyTypes.size());
    }
}
