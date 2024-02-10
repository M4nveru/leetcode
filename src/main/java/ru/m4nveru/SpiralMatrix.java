package ru.m4nveru;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int iLength = matrix.length, jLength = matrix[0].length, it = iLength * jLength, direction = 0, i = 0, j = 0;
        while (it != 0){
            switch (direction){
                case 0 -> {
                    result.add(matrix[i][j]);
                    matrix[i][j] = -101;
                    if (j+1 == jLength || matrix[i][j+1] == -101){
                        direction = 1;
                        i++;
                    } else {
                        j++;
                    }
                }
                case 1 -> {
                    result.add(matrix[i][j]);
                    matrix[i][j] = -101;
                    if (i + 1== iLength || matrix[i+1][j] == -101){
                        direction = 2;
                        j--;
                    } else {
                        i++;
                    }
                }
                case 2 -> {
                    result.add(matrix[i][j]);
                    matrix[i][j] = -101;
                    if (j - 1 == -1 || matrix[i][j - 1] == -101){
                        direction = 3;
                        i--;
                    } else {
                        j--;
                    }
                }
                case 3 -> {
                    result.add(matrix[i][j]);
                    matrix[i][j] = -101;
                    if (i - 1 == -1 || matrix[i - 1][j] == -101){
                        direction = 0;
                        j++;
                    } else {
                        i--;
                    }
                }
            }
            it--;
        }
        return result;
    }
}
