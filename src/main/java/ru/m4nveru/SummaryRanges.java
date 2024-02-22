package ru.m4nveru;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        var result = new ArrayList<String>();
        int leftVal, temp, iter = 1;
        if (nums.length == 0) {
            return result;
        } else if (nums.length == 1){
            result.add(String.valueOf(nums[0]));
            return result;
        }
        leftVal = nums[0];
        temp = nums[0];
        while (iter != nums.length){
            if (!(nums[iter] == temp + 1)){
                if (nums[iter-1] == leftVal) {
                    result.add(String.valueOf(leftVal));
                    leftVal = nums[iter];
                    temp = leftVal;
                    if (iter + 1 == nums.length){
                        result.add(String.valueOf(nums[iter]));
                    }
                }
                else {
                    result.add(leftVal + "->" + temp);
                    if (iter + 1 == nums.length){
                        result.add(String.valueOf(nums[iter]));
                    } else {
                        leftVal = nums[iter];
                        temp = leftVal;
                    }
                }
            }
            else {
                temp = nums[iter];
                if (iter + 1 == nums.length){
                    result.add(leftVal + "->" + temp);
                }
            }
            iter++;
        }
        return result;
    }
}
