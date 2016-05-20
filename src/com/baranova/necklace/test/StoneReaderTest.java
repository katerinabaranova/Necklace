package com.baranova.necklace.test;

import com.baranova.necklace.constant.FileConstant;

import java.io.File;

import static org.junit.Assert.*;


public class StoneReaderTest {

    @org.junit.Test
    public void testReadFile(){
        String src= FileConstant.STONE_FILE;
        File file=new File(src);
        assertTrue(file.exists());
    }

}