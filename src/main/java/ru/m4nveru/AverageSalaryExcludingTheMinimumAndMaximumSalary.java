package ru.m4nveru;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        for (int value : salary) {
            if (value > max) max = value;
            if (value < min) min = value;
            sum += value;
        }
        return (double) (sum - max - min) / (salary.length - 2);
    }
}
