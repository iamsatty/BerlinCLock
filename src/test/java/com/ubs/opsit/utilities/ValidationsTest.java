package com.ubs.opsit.utilities;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationsTest {

    @Test
    public void testValidValidations(){
        boolean expcectedValue=true;
        assertThat(Validations.isInputDataValid("23:59:59")).isEqualTo(expcectedValue);
    }
    @Test
    public void testInvalidValidations(){
        boolean expcectedValue=false;
        assertThat(Validations.isInputDataValid("23:59@59")).isEqualTo(expcectedValue);
    }
}
