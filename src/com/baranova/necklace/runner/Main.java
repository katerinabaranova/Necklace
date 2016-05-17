package com.baranova.necklace.runner;


import com.baranova.necklace.creation.NecklaceCreator;
import com.baranova.necklace.entity.Necklace;
import com.baranova.necklace.ie.NecklaceReader;
import com.baranova.necklace.ie.ReportWriter;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import com.baranova.necklace.entity.Stone;
import com.baranova.necklace.ie.StoneReader;
import com.baranova.necklace.util.StoneParser;

import java.util.ArrayList;
import java.util.Set;

public class Main {
    static final Logger LOG= LogManager.getLogger("Main");
    public static final String stoneFile=System.getProperty("user.dir")+"/resource/stones.txt";
    public static final String necklaceFile=System.getProperty("user.dir")+"/resource/necklace.txt";
    public static final String reportFile=System.getProperty("user.dir")+"/result/report.txt";
    public static final String intervalFile=System.getProperty("user.dir")+"/resource/interval.txt";


    public static void main(String[] args) {

        ArrayList<String> stonesString= StoneReader.readStonesFile(stoneFile);
        Set<Stone> necklaceComposition= StoneParser.parsingLine(stonesString);
        String necklaceName= NecklaceReader.readNecklaceFile(necklaceFile);
        Necklace newNecklace= NecklaceCreator.getNecklace(necklaceName,necklaceComposition);
        ReportWriter.reportNecklace(reportFile,newNecklace);
    }
}
