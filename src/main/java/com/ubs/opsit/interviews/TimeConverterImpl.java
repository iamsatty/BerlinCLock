package com.ubs.opsit.interviews;

import com.ubs.opsit.utilities.Validations;
import com.ubs.opsit.clock.BerlinClock;
import com.ubs.opsit.exception.IlIegealTimeFormatException;

import java.util.Optional;

public class TimeConverterImpl implements TimeConverter
{
    private BerlinClock berlinClock = new BerlinClock();
    @Override
    public String convertTime(String aTime) {
        Optional<String> optionalTime= Optional.ofNullable(aTime);
        optionalTime.ifPresent(oTime->{
            if(!Validations.isInputDataValid(oTime)){
                throw new IlIegealTimeFormatException("Invalid Input : '"+oTime+"' , valid format is HH:MM:SS");
            }
        });
        if(optionalTime.isPresent()){
        berlinClock.setInputTime(new com.ubs.opsit.utilities.LocalTime(optionalTime.get()));
        return berlinClock.composeBerlinClock();}else{
            return "";
        }
    }
}
