package ru.m4nveru;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0, length = mat[0].length-1;
        for (int i = 0; i < mat.length; i++){
            if (i == length - i){
                sum += mat[i][i];
            } else {
                sum += mat[i][i];
                sum += mat[i][length - i];
            }
        }
        return sum;
    }
}
