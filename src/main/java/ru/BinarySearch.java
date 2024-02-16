package ru;

public class BinarySearch {
    public static int binarySearch(int[] arr, int l, int r, int element){
        int pivotPos = (l+r)/2, pivot = arr[pivotPos];
        if (element == pivot){
            return (l+r)/2;
        } else if (l == r){
            return -1;
        }
        else if (element > pivot){
            return binarySearch(arr, pivotPos+1, r, element);
        } else {
            return binarySearch(arr, l, pivotPos - 1, element);
        }
    }
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid;
        while (l <= r){
            mid = l + (r - l) / 2;
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
