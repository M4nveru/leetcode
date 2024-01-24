package ru.m4nveru;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int trueIter = 0;
        int iter = 1;
        while (iter != nums.length){
            if (nums[iter] != nums[trueIter]){
                trueIter++;
                nums[trueIter] = nums[iter];
            }
            iter++;
        }
        return trueIter+1;
    }
}
