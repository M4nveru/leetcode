package ru.m4nveru;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0){
            System.arraycopy(nums2, 0, nums1, 0, nums2.length);
        } else if (n != 0){
            int pointer = m+n - 1;
            n--;
            m--;
            while (pointer!=-1){
                if (n==-1){
                    break;
                }
                if (nums2[n] <= nums1[m]){
                    nums1[pointer] = nums1[m];
                    nums1[m] = Integer.MIN_VALUE;
                    if (m!=0){
                        m--;
                    }
                } else {
                    nums1[pointer] = nums2[n];
                    n--;
                }
                pointer--;
            }
        }
    }
}