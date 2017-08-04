package com.ubs.opsit.clock;

import com.ubs.opsit.utilities.LocalTime;
import org.junit.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class BerlinClockTest {

    @Test
    public void testComposeBerlinCLock(){
        BerlinClock brc=new BerlinClock();
        brc.setInputTime(new LocalTime("23:59:59"));
        String expcectedValue="O" +System.getProperty("line.separator")+
                "RRRR" +System.getProperty("line.separator")+
                "RRRO" +System.getProperty("line.separator")+
                "YYRYYRYYRYY" +System.getProperty("line.separator")+
                "YYYY";
        assertThat(brc.composeBerlinClock()).isEqualTo(expcectedValue);

    }

    @Test
    public void testSetLocalTime(){
        BerlinClock brc=new BerlinClock();
        brc.setInputTime(new LocalTime("23:59:59"));
    }

}
