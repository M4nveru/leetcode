package ru.m4nveru;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int z = x ^ y, count = 0;
        for (char ch : Integer.toBinaryString(z).toCharArray()){
            if (ch == '1') count++;
        }
        return count;
    }
}
