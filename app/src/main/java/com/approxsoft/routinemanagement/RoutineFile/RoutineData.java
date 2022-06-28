package com.approxsoft.routinemanagement.RoutineFile;

public class RoutineData {

    String count, dayName;

    public RoutineData() {

    }

    public RoutineData(String count, String dayName) {
        this.count = count;
        this.dayName = dayName;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }
}