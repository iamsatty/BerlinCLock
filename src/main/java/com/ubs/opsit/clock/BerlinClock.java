package com.ubs.opsit.clock;

import com.ubs.opsit.utilities.LocalTime;

import java.util.Collections;
import java.util.StringJoiner;

public class BerlinClock {
    StringJoiner expectedClockOutput;
    LocalTime inputTime;

    public void setInputTime(LocalTime inputTime) {
        this.inputTime = inputTime;
    }

    public String composeBerlinClock(){
        expectedClockOutput= new StringJoiner(System.getProperty("line.separator"));
        this.expectedClockOutput.add(inputTime.getSeconds()%2==0?"Y":"O");
        this.expectedClockOutput.add(composeClockRow(inputTime.getHours()/5,4,"R"));
        this.expectedClockOutput.add(composeClockRow(inputTime.getHours()%5,4,"R"));
        this.expectedClockOutput.add(composeClockRow(inputTime.getMinutes()/5,11,"Y").replaceAll("YYY","YYR"));
        this.expectedClockOutput.add(composeClockRow(inputTime.getMinutes()%5,4,"Y"));
        return this.expectedClockOutput.toString();
    }

    private String composeClockRow(int onLed,int totalLed,String ledColor){
        int offLed=totalLed-onLed;
        String clockRow=String.join("", Collections.nCopies(onLed,ledColor))+String.join("", Collections.nCopies(offLed,"O"));
        return clockRow;
    }

    public String printClock(){
        return expectedClockOutput.toString();
    }
}
