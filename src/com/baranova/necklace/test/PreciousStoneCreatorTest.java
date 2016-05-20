package com.baranova.necklace.test;

import com.baranova.necklace.creation.PreciousStoneCreator;
import com.baranova.necklace.creation.StoneCreator;
import com.baranova.necklace.entity.Stone;
import org.junit.Test;

import static org.junit.Assert.*;


public class PreciousStoneCreatorTest {

    @Test
    public void testGetStone() throws Exception {
        String[] param={"Stone","Emerald","45","1.4","0.6"};
        StoneCreator stoneCreator=new PreciousStoneCreator();
        Stone result=stoneCreator.getStone(param);
        Stone stone=new Stone("Emerald",45,1.4,0.6);
        assertEquals(stone,result);
    }
}