package com.baranova.necklace.runner;

import com.baranova.necklace.constant.FileConstant;
import com.baranova.necklace.constant.MessageConstant;
import com.baranova.necklace.creation.NecklaceCreator;
import com.baranova.necklace.entity.Necklace;
import com.baranova.necklace.exception.EmptyFileException;
import com.baranova.necklace.exception.WrongNecklaceException;
import com.baranova.necklace.ie.NecklaceReader;
import com.baranova.necklace.ie.ReportWriter;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import com.baranova.necklace.entity.Stone;
import com.baranova.necklace.ie.StoneReader;
import com.baranova.necklace.util.StoneParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

public class Main {
    static final Logger LOG= LogManager.getLogger("Main");

    public static void main(String[] args) {
        try {
            ArrayList<String> stonesString = StoneReader.readStonesFile(FileConstant.STONE_FILE);
            Set<Stone> necklaceComposition = StoneParser.parsingLine(stonesString);
            String necklaceName = NecklaceReader.readNecklaceFile(FileConstant.NECKLACE_FILE);
            Necklace newNecklace = NecklaceCreator.getNecklace(necklaceName, necklaceComposition);
            ReportWriter.reportNecklace(FileConstant.REPORT_FILE, newNecklace);
        } catch (IOException e){
            //TODO message from constant send to method?
            ReportWriter.reportEmptyNecklace(FileConstant.REPORT_FILE,MessageConstant.READ_ERROR);
        } catch (EmptyFileException e){
            //TODO is it possible to do like this?
           // ReportWriter.reportNecklace(FileConstant.REPORT_FILE,null);
            ReportWriter.reportEmptyNecklace(FileConstant.REPORT_FILE, MessageConstant.EMPTY_FILE);
        } catch (WrongNecklaceException e){
            ReportWriter.reportEmptyNecklace(FileConstant.REPORT_FILE,MessageConstant.WRONG_INFORMATION);
        }
    }
}
