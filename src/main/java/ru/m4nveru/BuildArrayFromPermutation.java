package ru.m4nveru;

public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int it = 0; it < nums.length; it++){
            result[it] = nums[nums[it]];
        }
        return result;
    }
}
