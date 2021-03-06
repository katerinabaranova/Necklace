package com.baranova.necklace.creation;

import com.baranova.necklace.action.ActionNecklace;
import com.baranova.necklace.entity.Necklace;
import com.baranova.necklace.entity.Stone;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Set;

public class NecklaceCreator {
    static final Logger LOG= LogManager.getLogger();

    public static Necklace getNecklace(String necklaceName, Set<Stone> necklaceComposition){
        Necklace necklace=new Necklace(necklaceName,necklaceComposition);
        double weight= ActionNecklace.commonWeight(necklace);
        int cost= ActionNecklace.commonCost(necklace);
        necklace.setWeightCarats(weight);
        necklace.setCost(cost);
        return necklace;
    }
}
