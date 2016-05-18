package com.baranova.necklace.test;

import com.baranova.necklace.runner.Main;

import java.io.File;

import static org.junit.Assert.*;


public class StoneReaderTest {

    @org.junit.Test
    public void testReadFile(){
        String src= Main.stoneFile;
        File file=new File(src);
        assertTrue(file.exists());
    }

}