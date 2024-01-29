package ru.m4nveru;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean starting = true, increasing = true;
        for (int i = 0; i < nums.length; i++){
            if (starting){
                if (i != nums.length - 1 && nums[i] < nums[i + 1]){
                    increasing = true;
                    starting = false;
                } else if (i != nums.length - 1 && nums[i] > nums[i + 1]) {
                    increasing = false;
                    starting = false;
                }
            } else {
                if (increasing && i != nums.length - 1 && nums[i] > nums[i + 1]){
                    return false;
                } else if (!increasing && i != nums.length - 1 && nums[i] < nums[i + 1]){
                    return false;
                }
            }
        }
        return true;
    }
}
