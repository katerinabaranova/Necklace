package com.baranova.necklace.io;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;

public class StoneReader {

    static final Logger LOG= LogManager.getLogger("Main");

    public static ArrayList<String> readStonesFile(String filename) {

        ArrayList<String> stones=new ArrayList<>();
        File f=new File(filename);
        BufferedReader bufferedReader=null;
        try{
            bufferedReader=new BufferedReader(new FileReader(f));
            String line;
            while ((line=bufferedReader.readLine())!=null) {
                stones.add(line);
            }
        } catch (IOException e){
            LOG.error("Error while reading file:" + filename);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e){
                LOG.error("Error while reading file:" + filename);
            }
        }
        return stones;
    }
}
