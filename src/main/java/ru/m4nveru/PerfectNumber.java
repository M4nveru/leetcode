package ru.m4nveru;

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        if (num % 2 != 0) return false;
        for (int i = 1; i < num; i++){
            if (num % i == 0) sum+= i;
        }
        return sum==num;
    }
}
