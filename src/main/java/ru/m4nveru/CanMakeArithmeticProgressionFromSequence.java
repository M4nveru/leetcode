package ru.m4nveru;

public class CanMakeArithmeticProgressionFromSequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        quickSort(arr, 0, arr.length-1);
        int diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++){
            if (arr[i + 1] - arr[i] != diff){
                return false;
            }
        }
        return true;
    }
    private static void quickSort(int[] arr, int l, int r){
        if (l < r){
            int p = partition(arr, l, r);
            quickSort(arr, l, p-1);
            quickSort(arr, p, r);
        }
    }
    private static int partition(int[] arr, int l, int r){
        int pivot = arr[l];
        int i = l, j = r;
        while (i <= j){
            while (arr[i] < pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if (i <= j){
                swap(arr, i++, j--);
            }

        }
        return i;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] ar = {-509,-19,-439,-264,-404,-369,-299,-89,-229,-54,-194,16,-544,-159,-124,-474,-334};
        quickSort(ar, 0, ar.length-1);
        for (int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
        }
    }
}
