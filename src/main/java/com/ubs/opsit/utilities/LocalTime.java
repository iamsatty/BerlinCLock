package com.ubs.opsit.utilities;

import com.ubs.opsit.exception.IlIegealTimeFormatException;

public class LocalTime {
    private int hours;
    private int minutes;
    private int seconds;

    public LocalTime(String inputTime){
        String[] times=inputTime.split(":",3);
        if(Integer.parseInt(times[0])>24)
            throw new IlIegealTimeFormatException("Invalid value of Hour of Day (valid hours 0-24 )");
            this.hours=Integer.parseInt(times[0]);
        if(Integer.parseInt(times[1])>59)
            throw new IlIegealTimeFormatException("Invalid value of Minutes of Day (valid Minutes 0-59 )");
            this.minutes=Integer.parseInt(times[1]);
        if(Integer.parseInt(times[2])>59)
            throw new IlIegealTimeFormatException("Invalid value of Seconds of Day (valid Seconds 0-59 )");
            this.seconds=Integer.parseInt(times[2]);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
