package com.ubs.opsit.interviews;

import com.ubs.opsit.exception.IlIegealTimeFormatException;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TimeConverterImplTest {

    @Test
    public void testTimeConverter(){
        TimeConverterImpl tc=new TimeConverterImpl();

        String expcectedValue="O" +System.getProperty("line.separator")+
                "RRRR" +System.getProperty("line.separator")+
                "RRRO" +System.getProperty("line.separator")+
                "YYRYYRYYRYY" +System.getProperty("line.separator")+
                "YYYY";
        assertThat(tc.convertTime("23:59:59")).isEqualTo(expcectedValue);
    }

    @Test(expected=IlIegealTimeFormatException.class)
    public void testInvalidLocalTime(){
        TimeConverterImpl tc=new TimeConverterImpl();
        tc.convertTime("2@:20:1#");

    }

    @Test
    public void testINullLocalTime(){
        TimeConverterImpl tc=new TimeConverterImpl();
        tc.convertTime(null);
        assertThat(tc.convertTime(null)).isEqualTo("");
    }

}
