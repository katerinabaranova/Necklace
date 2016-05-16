package com.baranova.necklace.util;

import com.baranova.necklace.creation.PreciousStoneCreator;
import com.baranova.necklace.creation.StoneCreator;
import com.baranova.necklace.entity.Stone;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class StoneParser {

    public static Set<Stone> parsingLine(ArrayList<String> stonesString) {

        Set<Stone> stonesObjects=new HashSet<>();
        for (String stone:stonesString) {
            String[] stonePar;
            stonePar = stone.split(" ");
            StoneCreator stoneCreator = new PreciousStoneCreator();
            Stone newStone = stoneCreator.getStone(stonePar);
            stonesObjects.add(newStone);
        }

        return stonesObjects;
    }
}
