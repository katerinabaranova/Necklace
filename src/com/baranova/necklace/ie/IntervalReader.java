package com.baranova.necklace.ie;


import com.baranova.necklace.exception.EmptyFileException;
import com.baranova.necklace.exception.WrongIntervalException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IntervalReader {

        static final Logger LOG= LogManager.getLogger("Main");

        public static String readIntervalFile(String filename) {

            String interval = "";
            File f = new File(filename);
            BufferedReader bufferedReader = null;
            int linesKol = 0;
            try {
                bufferedReader = new BufferedReader(new FileReader(f));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    interval = line;
                    linesKol++;

                }
                if (linesKol > 1) {
                    throw new WrongIntervalException();
                }
                if (linesKol==0){
                    throw new EmptyFileException();
                }
            } catch (IOException e) {
                LOG.error("Error while reading file:" + filename);
            } catch (WrongIntervalException e){
                LOG.error("Error: too much information in interval file:"+filename);
                return new String("");
            }catch (EmptyFileException e){
                LOG.error("Empty interval file: "+filename);
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


