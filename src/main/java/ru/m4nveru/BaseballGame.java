package ru.m4nveru;

import java.util.Stack;

public class BaseballGame {
    public static int calPoints(String[] operations) {
        Stack<Integer> nums = new Stack<>();
        int num, tempSum, sum = 0;
        for (String operation : operations) {
            if (operation.equals("+")) {
                num = nums.pop();
                tempSum = num + nums.peek();
                nums.push(num);
                nums.push(tempSum);
            } else if (operation.equals("D")) {
                nums.push(nums.peek() * 2);
            } else if ((operation.equals("C"))) {
                nums.pop();
            } else {
                nums.push(Integer.parseInt(operation));
            }
        }
        while (!nums.isEmpty()){
            sum += nums.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] strings = {"5","-2","4","C","D","9","+","+"};
        calPoints(strings);
    }
}
