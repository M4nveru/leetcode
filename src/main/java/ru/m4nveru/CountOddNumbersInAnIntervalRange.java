package ru.m4nveru;

public class CountOddNumbersInAnIntervalRange {
    public int countOdds(int low, int high) {
        if (low % 2 + high % 2 == 0 || low % 2 + high % 2 == 1){
            return (high - low + 1) / 2;
        }
        return (high - low + 2) / 2;
    }
}
