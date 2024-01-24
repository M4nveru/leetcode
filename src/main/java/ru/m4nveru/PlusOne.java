package ru.m4nveru;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        return recoursiveIncrement(digits, digits.length-1);
    }

    private static int[] recoursiveIncrement(int[] digits, int pos){
        if (digits[pos] == 9 && pos == 0){
            digits[pos] = 0;
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for (int i = 0; i < digits.length; i++){
                result[i+1] = digits[i];
            }
            return result;
        } else {
            if (digits[pos] == 9){
                digits[pos] = 0;
                return recoursiveIncrement(digits, pos-1);
            }
            digits[pos] += 1;
        }
        return digits;
    }
}
