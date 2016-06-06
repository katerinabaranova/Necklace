package com.baranova.necklace.util;

import com.baranova.necklace.exception.WrongIntervalException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntervalParser {
    static final Logger LOG= LogManager.getLogger("IntervalParser");

    public static double[] parsingIntervalLine(String interval) throws WrongIntervalException {
        if (!IntervalValidation.validateInterval(interval)) {throw new WrongIntervalException();}
        String [] intervalString=interval.split(" ");
        double [] intervalArray=new double[2];
        intervalArray[0]=Double.parseDouble(intervalString[0]);
        intervalArray[1]=Double.parseDouble(intervalString[1]);
        return intervalArray;
    }
}
