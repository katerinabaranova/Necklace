package com.baranova.necklace.runner;


import com.baranova.necklace.action.ActionNecklace;
import com.baranova.necklace.entity.Necklace;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import com.baranova.necklace.entity.Stone;
import com.baranova.necklace.io.StoneReader;
import com.baranova.necklace.util.StoneParser;

import java.util.ArrayList;
import java.util.Set;

public class Main {
    static final Logger LOG= LogManager.getLogger("Main");
    public static final String stoneFile=System.getProperty("user.dir")+"/resource/stones.txt";
    public static final String necklaceFile=System.getProperty("user.dir")+"/resource/necklace.txt";

    public static void main(String[] args) {

        ArrayList<String> stonesString= StoneReader.readStonesFile(stoneFile);
        Set<Stone> necklaceComposition= StoneParser.parsingLine(stonesString);

        Necklace aleksandrina=new Necklace("Aleksandrina",necklaceComposition );
        double weight= ActionNecklace.commonWeigth(aleksandrina);
        int cost= ActionNecklace.commonCost(aleksandrina);
        aleksandrina.setWeightCarats(weight);
        aleksandrina.setCost(cost);
        System.out.println(aleksandrina);
        ActionNecklace.sortingNecklace(aleksandrina.getComposition());
    }
}
