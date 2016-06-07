package com.baranova.necklace.ie;

import com.baranova.necklace.exception.EmptyFileException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;

public class StoneReader {

    static final Logger LOG= LogManager.getLogger();

    public static ArrayList<String> readStonesFile(String filename) throws IOException,EmptyFileException {

        ArrayList<String> stones=new ArrayList<>();
        File f=new File(filename);
        BufferedReader bufferedReader=null;
        try{
            bufferedReader=new BufferedReader(new FileReader(f));
            String line;
            while ((line=bufferedReader.readLine())!=null) {
                stones.add(line);
            }
            if (stones.isEmpty()){throw new EmptyFileException();}
        } catch (IOException e){
            LOG.error("Error while reading file: " + filename);
            throw e;
        } catch(EmptyFileException e) {
            LOG.error("Empty stone file: "+filename);
            throw e;
        }finally {
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
