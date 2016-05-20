package com.baranova.necklace.ie;


import com.baranova.necklace.exception.EmptyFileException;
import com.baranova.necklace.exception.WrongNecklaceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NecklaceReader {

        static final Logger LOG= LogManager.getLogger("Main");

        public static String readNecklaceFile(String filename) throws IOException,EmptyFileException,WrongNecklaceException {

            String necklaceName="";
            File f=new File(filename);
            BufferedReader bufferedReader=null;
            int linesKol = 0;

            try{
                bufferedReader=new BufferedReader(new FileReader(f));
                String line;
                while ((line=bufferedReader.readLine())!=null) {
                    necklaceName=line;
                    linesKol++;
                }
                if (linesKol > 1) {
                    throw new WrongNecklaceException();
                }
                if (linesKol==0){
                    throw new EmptyFileException();
                }
            } catch (IOException e){
                LOG.error("Error while reading file:" + filename);
                throw e;
            } catch (WrongNecklaceException e) {
                LOG.error("Error: too much information in necklace file:"+filename);
                throw e;
            }catch (EmptyFileException e){
                LOG.error("Empty necklace file: "+filename);
                throw e;
            } finally {
                try {
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                } catch (IOException e){
                    LOG.error("Error while reading file:" + filename);
                }
            }
            return necklaceName;
        }
    }


