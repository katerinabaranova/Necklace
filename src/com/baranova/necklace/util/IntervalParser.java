package com.baranova.necklace.util;

import com.baranova.necklace.exception.IntervalException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntervalParser {
    static final Logger LOG= LogManager.getLogger("Main");

    public static double[] parsingIntervalLine(String interval) {

        String [] intervalString=interval.split(" ");
        double [] intervalArray=new double[2];
        try {
            if (intervalString.length > 2) {
                throw new IntervalException();
            }
            intervalArray[0]=Double.parseDouble(intervalString[0]);
            intervalArray[1]=Double.parseDouble(intervalString[1]);

        } catch (Exception e){
            LOG.error("Wrong interval information in file");
            return null;
        }
        return intervalArray;
    }
}
