package com.williamsonam.challenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   @Test
    public void testFindMinimumRanges(){

       ZipRange zipRange = new ZipRange();
       zipRange.setLowerRange(94133);
       zipRange.setUpperRange(94133);

       ZipRange zipRange1 = new ZipRange();
       zipRange1.setLowerRange(94200);
       zipRange1.setUpperRange(94299);

       ZipRange zipRange2 = new ZipRange();
       zipRange2.setLowerRange(94600);
       zipRange2.setUpperRange(94699);

       ArrayList<ZipRange> testAl = new ArrayList<>();
       testAl.add(zipRange);
       testAl.add(zipRange1);
       testAl.add(zipRange2);
       List resultList = App.findMinimumRanges(testAl);

       assertEquals("[[94133,94133], [94200,94299], [94600,94699]]", resultList.toString());
   }

    @Test
    public void testFindMinimumRangesScenario2(){

        ZipRange zipRange = new ZipRange();
        zipRange.setLowerRange(94133);
        zipRange.setUpperRange(94133);

        ZipRange zipRange1 = new ZipRange();
        zipRange1.setLowerRange(94200);
        zipRange1.setUpperRange(94299);

        ZipRange zipRange2 = new ZipRange();
        zipRange2.setLowerRange(94226);
        zipRange2.setUpperRange(94399);

        ArrayList<ZipRange> testAl = new ArrayList<>();
        testAl.add(zipRange);
        testAl.add(zipRange1);
        testAl.add(zipRange2);
        List resultList = App.findMinimumRanges(testAl);

        assertEquals("[[94133,94133], [94200,94399]]", resultList.toString());
    }

    @Test
    public void testFindMinimumRangesScenario3(){

        ZipRange zipRange = new ZipRange();
        zipRange.setLowerRange(94133);
        zipRange.setUpperRange(94134);

        ZipRange zipRange1 = new ZipRange();
        zipRange1.setLowerRange(94210);
        zipRange1.setUpperRange(94399);

        ZipRange zipRange2 = new ZipRange();
        zipRange2.setLowerRange(93190);
        zipRange2.setUpperRange(94699);

        ArrayList<ZipRange> testAl = new ArrayList<>();
        testAl.add(zipRange);
        testAl.add(zipRange1);
        testAl.add(zipRange2);
        List resultList = App.findMinimumRanges(testAl);

        assertEquals("[[93190,94699], [94210,94399]]", resultList.toString());
    }
}
