package ru.m4nveru;

public class PalindromeNumber {
    public static boolean isPalindromeBad(int x) {
        if (x < 0){
            return false;
        } else {
            char[] chars = String.valueOf(x).toCharArray();
            String result = "";
            for (int i = 0; i < chars.length; i++){
                result = chars[i] + result;
            }
            return result.equals(String.valueOf(x));
        }
    }

    public static boolean isPalindrome(int x) {
        if (x >= 0){
            int copyOfX = x;
            int result = 0;
            while (copyOfX != 0){
                result = result * 10 + copyOfX % 10;
                copyOfX /= 10;
            }
            return x == result;
        }
        return false;
    }
}
