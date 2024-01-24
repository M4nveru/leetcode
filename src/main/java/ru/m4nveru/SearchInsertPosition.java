package ru.m4nveru;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }

    private static int binarySearch(int[] nums, int target, int s, int f){
        if (s == f || f < s){
            if (target > nums[s]) return s+1;
            return s;
        }

        int pivot = (s+f) / 2;

        if (target < nums[pivot])
            return binarySearch(nums, target, s, pivot - 1);
        else if (target > nums[pivot])
            return binarySearch(nums, target, pivot + 1, f);
        return pivot;
    }
}
