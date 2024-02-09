package ru.m4nveru;

public class RobotBoundedInCircle {
    public boolean isRobotBounded(String instructions) {
        int direction = 0, x = 0, y = 0;
        for(char move : instructions.toCharArray()){
            if (move == 'R' || move == 'L'){
                direction = move(direction, move);
            } else {
                switch (direction){
                    case 0 -> y++;
                    case 1 -> x++;
                    case 2 -> y--;
                    case 3 -> x--;
                }
            }
        }
        return x == 0 && y == 0 || direction!=0;
    }
    private static int move(int direction, char move){
        if (direction == 0 && move == 'L') direction = 3;
        else if (direction == 3 && move == 'R') direction = 0;
        else if (move == 'L') direction--;
        else  direction++;
        return direction;
    }
}
