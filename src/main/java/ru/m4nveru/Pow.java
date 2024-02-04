package ru.m4nveru;

public class Pow {
    public double myPow(double x, long n) {
        return getPow(x, n);
    }

    private static double getPow(double x, long n){
        if (n == 0 || x == 1){
            return 1;
        }
        if (n < 0){
            return getPow(1/x, -n);
        }
        if (n % 2 == 0){
            return getPow(x*x, n / 2);
        }
        return x * getPow(x*x, n/2);
    }
}
