package com.ubs.opsit.utilities;

import com.ubs.opsit.clock.BerlinClock;
import com.ubs.opsit.exception.IlIegealTimeFormatException;
import com.ubs.opsit.interviews.TimeConverterImpl;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LocalTimeTest {

    @Test(expected=IlIegealTimeFormatException.class)
    public void testInvalidLocalHour(){
        TimeConverterImpl tc=new TimeConverterImpl();
        tc.convertTime("25:20:10");
    }

    @Test(expected=IlIegealTimeFormatException.class)
    public void testInvalidLocalMinute(){
        TimeConverterImpl tc=new TimeConverterImpl();
        tc.convertTime("22:60:10");
    }

    @Test(expected=IlIegealTimeFormatException.class)
    public void testInvalidLocalSecond(){
        TimeConverterImpl tc=new TimeConverterImpl();
        tc.convertTime("22:20:60");
    }
    @Test
    public void testGetHours(){
        LocalTime lt=new LocalTime("23:59:59");
        int expcectedValue=23;
        assertThat(lt.getHours()).isEqualTo(expcectedValue);
    }
    @Test
    public void testGetMinutes(){
        LocalTime lt=new LocalTime("23:59:59");
        int expcectedValue=59;
        assertThat(lt.getMinutes()).isEqualTo(expcectedValue);
    }
    @Test
    public void testGetSeconds(){
        LocalTime lt=new LocalTime("23:59:20");
        int expcectedValue=20;
        assertThat(lt.getSeconds()).isEqualTo(expcectedValue);
    }
}
