package com.baranova.necklace.test;

import com.baranova.necklace.util.StoneValidation;
import org.junit.Test;

import static org.junit.Assert.*;


public class StoneValidationTest {

    @Test
    public void testValidateStone() throws Exception {
        String[] param={"Vbhdnf","Emerald","45","1.4","0.6"};
        boolean result= StoneValidation.validateStone(param);
        assertTrue(result);

    }
}