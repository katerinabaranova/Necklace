package com.baranova.necklace.creation;


import com.baranova.necklace.entity.Amber;
import com.baranova.necklace.entity.Pearl;
import com.baranova.necklace.entity.Stone;

public class PreciousStoneCreator implements StoneCreator{

    @Override
    public Stone getStone (String[] param){
        switch (param[0].toLowerCase()){
            case "pearl":
                Pearl pearl=new Pearl();
                pearl.setName(param[1]);
                pearl.setCost(Integer.parseInt(param[2]));
                pearl.setWeight(Double.parseDouble(param[3]));
                pearl.setTransparency(Double.parseDouble(param[4]));
                pearl.setDiameter(Double.parseDouble(param[5]));
                return pearl;

            case "amber":
                Amber amber=new Amber();
                amber.setName(param[1]);
                amber.setCost(Integer.parseInt(param[2]));
                amber.setWeight(Double.parseDouble(param[3]));
                amber.setTransparency(Double.parseDouble(param[4]));
                amber.setNumberHardness(Double.parseDouble(param[5]));
                return amber;

            case "stone":
                Stone stone=new Stone();
                stone.setName(param[1]);
                stone.setCost(Integer.parseInt(param[2]));
                stone.setWeight(Double.parseDouble(param[3]));
                stone.setTransparency(Double.parseDouble(param[4]));
                return stone;

        }

        return null;
    }

}
