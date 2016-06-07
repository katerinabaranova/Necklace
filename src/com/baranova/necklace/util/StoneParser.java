package com.baranova.necklace.util;

import com.baranova.necklace.creation.PreciousStoneCreator;
import com.baranova.necklace.creation.StoneCreator;
import com.baranova.necklace.entity.Stone;
import com.baranova.necklace.exception.NotValidStoneException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class StoneParser {
    static final Logger LOG= LogManager.getLogger();
    public static Set<Stone> parsingLine(ArrayList<String> stonesString) {

        Set<Stone> stonesObjects=new HashSet<>();
        for (String stone:stonesString) {
            String[] stonePar;
            stonePar = stone.split(" ");
            StoneCreator stoneCreator = new PreciousStoneCreator();
            try {
                Stone newStone = stoneCreator.getStone(stonePar);
                stonesObjects.add(newStone);
            } catch (NotValidStoneException e){
                LOG.error("Wrong stone information in file");
            }
        }
        return stonesObjects;
    }
}
