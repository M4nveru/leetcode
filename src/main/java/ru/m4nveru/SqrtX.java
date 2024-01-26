package ru.m4nveru;

public class SqrtX {
    public int mySqrt(int x) {
        if (x == 0){
            return x;
        }

        int l = 1, r = x;
        int mid;
        while (l<=r){
            mid = l + (r - l) / 2;
            if (mid == x / mid){
                return mid;
            } else if (mid > x / mid){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }
}
