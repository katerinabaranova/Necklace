package com.baranova.necklace.creation;


import com.baranova.necklace.entity.Amber;
import com.baranova.necklace.entity.Pearl;
import com.baranova.necklace.entity.Stone;
import com.baranova.necklace.exception.NotValidStoneException;
import com.baranova.necklace.util.StoneValidation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PreciousStoneCreator implements StoneCreator{
    static final Logger LOG= LogManager.getLogger("Main");
    @Override
    public Stone getStone (String[] param){
        try {
            boolean valid = StoneValidation.validateStone(param);
            if (!valid) {
                throw new NotValidStoneException("Wrong stone information in file");
            }
            switch (param[0].toLowerCase()) {
                case "pearl":
                    Pearl pearl = new Pearl();
                    pearl.setName(param[1]);
                    pearl.setCost(Integer.parseInt(param[2]));
                    pearl.setWeight(Double.parseDouble(param[3]));
                    pearl.setTransparency(Double.parseDouble(param[4]));
                    pearl.setDiameter(Double.parseDouble(param[5]));
                    return pearl;

                case "amber":
                    Amber amber = new Amber();
                    amber.setName(param[1]);
                    amber.setCost(Integer.parseInt(param[2]));
                    amber.setWeight(Double.parseDouble(param[3]));
                    amber.setTransparency(Double.parseDouble(param[4]));
                    amber.setNumberHardness(Double.parseDouble(param[5]));
                    return amber;

                case "stone":
                    Stone stone = new Stone();
                    stone.setName(param[1]);
                    stone.setCost(Integer.parseInt(param[2]));
                    stone.setWeight(Double.parseDouble(param[3]));
                    stone.setTransparency(Double.parseDouble(param[4]));
                    return stone;

            }
        }catch (NotValidStoneException e){
            LOG.error("Wrong stone information in file");
        }
        return null;
    }

}
