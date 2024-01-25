package ru.m4nveru;

import java.math.BigInteger;
import java.util.Arrays;

public class AddBinary {
    public String addBinary(String a, String b) {
        int carry = 0;
        String temp;
        if (a.length() > b.length()){
            temp = a;
            a = b;
            b = temp;
        }
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        int i = aChars.length - 1;
        int j = b.length() - 1;

        while (j>=0 && (carry != 0 || i>= 0)){
            if (i >= 0){
                if (aChars[i] == bChars[j] && bChars[j] != '0'){
                    if (carry == 0){
                        carry = 1;
                        bChars[j] = '0';
                    } else {
                        bChars[j] = '1';
                    }
                } else if (aChars[i] == bChars[j] && bChars[j] == '0'){
                    if (carry == 1){
                        bChars[j] = '1';
                        carry = 0;
                    }
                } else {
                    if (carry == 0){
                        bChars[j] = '1';
                    } else {
                        bChars[j] = '0';
                    }
                }
                i--;
                j--;
            } else {
                if (bChars[j] == '0'){
                    bChars[j] = '1';
                    carry = 0;
                } else {
                    bChars[j] = '0';
                    j--;
                }
            }
        }
        if (carry != 0){
            return "1" + new String(bChars);
        }
        return new String(bChars);
    }
}
