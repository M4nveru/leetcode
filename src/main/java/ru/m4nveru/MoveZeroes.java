package ru.m4nveru;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int zeroPointer = -1, pointer = 0;
        while (pointer <= nums.length -1){
            if (nums[pointer] == 0 && (zeroPointer == -1 || zeroPointer > pointer)){
                zeroPointer = pointer;
                pointer++;
                continue;
            }
            if (nums[pointer] != 0 && zeroPointer != -1){
                swap(nums, zeroPointer, pointer);
                zeroPointer++;
                pointer++;
                continue;
            }
            pointer++;
        }
    }
    private static void swap(int[] arr, int el1, int el2){
        int temp = arr[el1];
        arr[el1] = arr[el2];
        arr[el2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }
}
