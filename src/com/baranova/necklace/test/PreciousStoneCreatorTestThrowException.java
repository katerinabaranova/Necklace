package com.baranova.necklace.test;

import com.baranova.necklace.creation.PreciousStoneCreator;
import com.baranova.necklace.creation.StoneCreator;
import com.baranova.necklace.entity.Stone;
import com.baranova.necklace.exception.NotValidStoneException;
import org.junit.Test;

import static org.junit.Assert.*;


public class PreciousStoneCreatorTestThrowException {


    @Test(expected = NotValidStoneException.class)
    public void testGetStone() {
        String[] param = {"Stone", "Ruby","15", "0.8", "aa"};
        StoneCreator stoneCreator = new PreciousStoneCreator();

        Stone stone=stoneCreator.getStone(param);
    }
}