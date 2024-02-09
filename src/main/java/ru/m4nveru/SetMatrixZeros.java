package ru.m4nveru;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        Set<Integer> cols = new HashSet<>();
        boolean isZero = false;
        for(int i = 0; i < matrix.length; i++){
            isZero = false;
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    cols.add(j);
                    isZero = true;
                    for (int g = 0; g < i; g++){
                        matrix[g][j] = 0;
                    }
                    for (int g = 0; g < j; g++){
                        matrix[i][g] = 0;
                    }
                }
                if (isZero || cols.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
