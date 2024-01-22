package ru.m4nveru;

import java.util.Hashtable;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hashTable = new Hashtable<>();
        for (int i = 0; i < nums.length; i++){
            hashTable.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            if (hashTable.containsKey(target - nums[i]) && hashTable.get(target - nums[i]) != i){
                return new int[]{i, hashTable.get(target - nums[i])};
            }
        }
        return null;
    }
}