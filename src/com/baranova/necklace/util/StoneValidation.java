package com.baranova.necklace.util;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class StoneValidation {
    static final Logger LOG= LogManager.getLogger("Main");

    public static boolean validateStone(String[] param){
        boolean valid=true;
        try{
            int cost=Integer.parseInt(param[2]);
            double weight=Double.parseDouble(param[3]);
            double transparency=Double.parseDouble(param[4]);
            double extra=0;
            if (param.length>5) {
                extra=Double.parseDouble(param[5]);

            }
            if ((cost<0)||(weight<0)||(transparency<0)||(transparency>1)||(extra<0)){
                valid=false;
            }
            if (("stone".equalsIgnoreCase(param[0])&&param.length!=5)||("amber".equalsIgnoreCase(param[0])&&param.length!=6)||
                    ("pearl".equalsIgnoreCase(param[0])&&param.length!=6)){
                valid=false;
            }
        } catch (Exception e){
            valid=false;
        }
        return valid;
    }
}
