package src.com.baranova.necklace.test;

import java.io.File;

import static org.junit.Assert.*;


public class StoneReaderTest {

    @org.junit.Test
    public void testReadFile(){
        String src=System.getProperty("user.dir")+"/src/by/bsu/OOP_Necklace_Baranova/txt/stones.txt";
        File file=new File(src);
        assertTrue(file.exists());
    }

}