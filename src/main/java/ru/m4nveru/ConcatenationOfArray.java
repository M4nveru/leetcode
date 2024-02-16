package ru.m4nveru;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        int it = 0;
        for (int i = 0; i < 2; i++){
            for (int num : nums){
                res[it] = num;
                it++;
            }
        }
        return res;
    }
}
