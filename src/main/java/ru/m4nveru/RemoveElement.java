package ru.m4nveru;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int trueIter = 0;
        int iter = 0;
        while (iter != nums.length){
            if (nums[iter] != val){
                nums[trueIter] = nums[iter];
                trueIter++;
            }
            iter++;
        }
        return trueIter;
    }
}
