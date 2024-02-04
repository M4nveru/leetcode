package ru.m4nveru;

import java.util.Arrays;
import java.util.Comparator;

public class CheckIfItIsAStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        // (x - x1) / (x2 - x1) = (y - y1) / (y2 - y1)
        int x0= coordinates[0][0], y0= coordinates[0][1], x1= coordinates[1][0], y1=coordinates[1][1];
        for (int i = 0; i < coordinates.length; i++){
            if ((y0 - y1) * (coordinates[i][0] - x1) != (coordinates[i][1] - y1) * (x0 - x1)){
                return false;
            }
        }
        return true;
    }
}
