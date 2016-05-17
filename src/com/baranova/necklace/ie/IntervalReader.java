package com.baranova.necklace.ie;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IntervalReader {

        static final Logger LOG= LogManager.getLogger("Main");

        public static String readIntervalFile(String filename) {

            String interval="";
            File f=new File(filename);
            BufferedReader bufferedReader=null;
            try{
                bufferedReader=new BufferedReader(new FileReader(f));
                String line;
                while ((line=bufferedReader.readLine())!=null) {
                    interval=line;
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
            return interval;
        }
    }


