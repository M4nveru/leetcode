package ru.m4nveru;

public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int vertSum=0, horizSum=0;
        for (char ch : moves.toCharArray()){
            if (ch == 'R') {
                horizSum++;
            } else if (ch == 'L') {
                horizSum--;
            } else if (ch == 'U') {
                vertSum++;
            } else if (ch == 'D') {
                vertSum--;
            }
        }
        return vertSum == 0 && horizSum == 0;
    }
}
