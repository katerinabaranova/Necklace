package com.baranova.necklace.ie;



import com.baranova.necklace.action.ActionNecklace;
import com.baranova.necklace.constant.FileConstant;
import com.baranova.necklace.entity.Necklace;
import com.baranova.necklace.entity.Stone;
import com.baranova.necklace.util.IntervalParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.List;
import java.util.Set;

public class ReportWriter {
    static final Logger LOG= LogManager.getLogger("Main");

    public static void reportNecklace(String filename, Necklace necklace) {

        File f=new File(filename);
        PrintWriter printWriter=null;
        try{
            printWriter = new PrintWriter(new FileWriter(f));
            printWriter.println(necklace);
            printWriter.println();
            printWriter.println("Sorted stones:");
            List<Stone> sortedNecklace = ActionNecklace.sortingNecklace(necklace.getComposition());
            for (Stone stone : sortedNecklace) {
                printWriter.println(stone);
            }
            printWriter.println();
            String interval = IntervalReader.readIntervalFile(FileConstant.INTERVAL_FILE);
            double[] intervalArray = IntervalParser.parsingIntervalLine(interval);
            if (intervalArray != null) {
                double startTransp = intervalArray[0];
                double endTransp = intervalArray[1];
                printWriter.println("Stones with transparency between " + startTransp + " and " + endTransp);
                Set<Stone> transpStone = ActionNecklace.checkingTransparency(necklace, startTransp, endTransp);
                for (Stone stone : transpStone) {
                    printWriter.println(stone);
                }
            } else {
                printWriter.println("Impossible to write transparency report: there is no/wrong information in file");
            }

        }catch (IOException e){
            LOG.error("Error while writing file:" + filename);
        }finally{
            if (printWriter!=null){
                printWriter.close();
            }
        }

    }

    public static void reportEmptyNecklace(String filename, String message){
        File f=new File(filename);
        PrintWriter printWriter=null;
        try{
            printWriter = new PrintWriter(new FileWriter(f));
            printWriter.println(message);
        }catch (IOException e){
            LOG.error("Error while writing file:" + filename);
        }finally{
            if (printWriter!=null){
                printWriter.close();
            }
        }
    }

}
