package ru.m4nveru;

public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        int absentSum = 0, lateSeries = 0;
        for(char ch : s.toCharArray()){
            if (ch == 'A'){
                lateSeries = 0;
                if (absentSum < 2){
                    absentSum++;
                } else return false;
            } else if (ch == 'L'){
                if (lateSeries + 1 == 3){
                    return false;
                } else lateSeries++;
            } else {
                lateSeries = 0;
            }
        }
        return true;
    }
}
