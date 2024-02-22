package ru.m4nveru;

public class ReverseStringII {
    public String reverseStr(String s, int k) {
        int mainPointer = 0, rPointer = k - 1, lPointer = 0;
        char[] result = s.toCharArray();
        if (result.length <= k){
            reverse(result, 0, result.length - 1);
        } else {
            while (true){
                if (result.length - 1 - mainPointer >= k && result.length - 1 - mainPointer < 2*k){
                    reverse(result, lPointer, rPointer);
                    break;
                } else if (s.length() - 1 - mainPointer < k){
                    reverse(result, lPointer, result.length - 1);
                    break;
                }
                reverse(result, lPointer, rPointer);
                mainPointer += 2 * k;
                lPointer = mainPointer;
                rPointer = mainPointer + k - 1;
            }
        }
        return new String(result);
    }

    private void reverse(char[] result, int lPointer, int rPointer){
        char temp;
        while (lPointer < rPointer){
            temp = result[lPointer];
            result[lPointer] = result[rPointer];
            result[rPointer] = temp;
            lPointer++;
            rPointer--;
        }
    }
}
