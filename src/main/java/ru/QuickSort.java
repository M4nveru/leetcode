package ru;

public class QuickSort {
    public static void quickSort(int[] arr, int l, int r){
        if (l < r){
            int pivot = partition(arr, l, r);
            quickSort(arr, l, pivot - 1);
            quickSort(arr, pivot, r);
        }
    }
    private static int partition(int[] arr, int l, int r){
        int pivot = arr[l];
        int leftIndex = l, rightIndex = r;
        while (leftIndex <= rightIndex){
            while(arr[leftIndex] < pivot){
                leftIndex++;
            }
            while (arr[rightIndex] > pivot){
                rightIndex--;
            }
            if (leftIndex <= rightIndex){
                swap(arr, leftIndex++, rightIndex++);
            }
        }
        return leftIndex;
    }

    private static void swap(int[] arr, int el1, int el2){
        int temp = arr[el1];
        arr[el1] = arr[el2];
        arr[el2] = arr[temp];
    }
}
