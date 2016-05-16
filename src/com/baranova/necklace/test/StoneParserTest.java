package src.com.baranova.necklace.test;

import src.com.baranova.necklace.entity.Stone;
import src.com.baranova.necklace.util.StoneParser;

import static org.junit.Assert.*;


public class StoneParserTest {

    @org.junit.Test
    public void testParsingLine() {
        Stone res= StoneParser.parsingLine("Stone Opal 13 1.1 0.8");
        Stone stone=new Stone("Opal",13,1.1,0.8);
        assertEquals(res,stone);
    }
}