package ru.m4nveru;

public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if (num == 0){
            return true;
        }
        int l = 1,r = num, mid;
        while (l<=r){
            mid = l + (r - l) / 2;
            if (mid == num / mid && num % mid == 0){
                return true;
            } else if (mid < num / mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        isPerfectSquare(5);
    }
}
