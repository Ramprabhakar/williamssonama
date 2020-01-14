package com.williamsonam.challenge;
import java.util.Comparator;

public class ZipRangeComparator implements Comparator {

    @Override
    public int compare(Object arg1, Object arg2) {
        ZipRange zipRange1 = (ZipRange) arg1;
        ZipRange zipRange2 = (ZipRange) arg2;
        if(zipRange1.getLowerRange() < zipRange2.getLowerRange()){
            return -1;
        }if(zipRange1.getLowerRange() > zipRange2.getLowerRange()){
            return 1;
        }if(zipRange2.getLowerRange() == zipRange2.getLowerRange()){
            return 0;
        }
        return  1;
    }
}

