package ru.m4nveru;

public class SignOfTheProductOfArray {
    public int arraySign(int[] nums) {
        int negCount = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0){
                negCount++;
            }
        }
        return negCount % 2 == 0 ? 1 : -1;
    }
}
