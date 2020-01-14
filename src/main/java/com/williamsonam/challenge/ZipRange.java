package com.williamsonam.challenge;


public class ZipRange {

    public int getLowerRange() {
        return lowerRange;
    }

    public void setLowerRange(int lowerRange) {
        this.lowerRange = lowerRange;
    }

    public int getUpperRange() {
        return upperRange;
    }

    public void setUpperRange(int upperRange) {
        this.upperRange = upperRange;
    }

    int lowerRange;
    int upperRange;

    @Override
    public String toString() {
        return "[" + lowerRange + "," + upperRange + "]";
    }
}
