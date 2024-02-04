package ru.m4nveru;

import java.util.Arrays;

public class FindWinnerOnATicTacToeGame {
    public String tictactoe(int[][] moves) {
        int[][] field = new int[3][3];
        boolean isFirst = true;
        for (int i = 0; i < moves.length; i++){
            field[moves[i][0]][moves[i][1]] = isFirst ? 2 : 1;
            isFirst = !isFirst;
        }
        for (int i = 0; i < 3; i++){
            if (field[i][0] == field[i][1] && field[i][1] == field[i][2]){
                return field[i][2]==2 ? "A" : field[i][2] == 1 ? "B" : "Pending";
            } else if (field[0][i] == field[1][i] && field[1][i] == field[2][i]){
                return field[2][i]==2 ? "A" : field[2][i] == 1 ? "B" : "Pending";
            }
        }
        if (field[0][0] == field[1][1] && field[1][1] == field[2][2]){
            return field[0][0]==2 ? "A" : field[0][0] == 1 ? "B" : "Pending";
        }
        if (field[0][2] == field[1][1] && field[1][1] == field[2][0]){
            return field[0][2]==2 ? "A" : field[0][2] == 1 ? "B" : "Pending";
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (field[i][j]==0){
                    return "Pending";
                }
            }
        }
        return "Draw";
    }
}
