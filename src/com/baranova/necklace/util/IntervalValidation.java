package com.baranova.necklace.util;

import com.baranova.necklace.exception.WrongIntervalException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntervalValidation {
    static final Logger LOG= LogManager.getLogger();

    public static boolean validateInterval(String interval)  {
        boolean valid=true;
        if (interval.isEmpty()) {return false;}
        String [] intervalString=interval.split(" ");
        double [] intervalArray=new double[2];
        if (intervalString.length > 2) {
            valid=false;
        }
        try {
            intervalArray[0]=Double.parseDouble(intervalString[0]);
            intervalArray[1]=Double.parseDouble(intervalString[1]);

        } catch (NumberFormatException e){
            valid=false;
        }

        return valid;
    }
}
