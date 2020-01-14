package com.williamsonam.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
program: to format ziprange codes
 */
public class App {

    public static void main(String[] args){
        List<ZipRange> input = readDataFromCmdLine();

        List<ZipRange> minimumRangeRestrictions = findMinimumRanges(input);

        printZipRanges(minimumRangeRestrictions);

    }

    public static List<ZipRange> readDataFromCmdLine(){
        Scanner myInput = new Scanner(System.in);
        List<ZipRange> list = new ArrayList<ZipRange>();
        String zipCodes = myInput.nextLine();
        String[] zip = zipCodes.split(" ");

        List<ZipRange> zipRangeList = new ArrayList<>();

        for (String it1: zip){

            String[] zip1 = it1.replaceAll("\\[","").replaceAll("]","").split(",");

            ZipRange zipRange = new ZipRange();
            zipRange.setLowerRange(Integer.parseInt(zip1[0]));
            zipRange.setUpperRange(Integer.parseInt(zip1[1]));
            zipRangeList.add(zipRange);
        }
        return zipRangeList;
    }

    public static List<ZipRange> findMinimumRanges(List<ZipRange> input){

        Collections.sort(input,new ZipRangeComparator());

        for(int i = 0; i < input.size()-1 ;i++){

            ZipRange zip = input.get(i);
            ZipRange zipNext = input.get(i+1);
            if(zip.getUpperRange() > zipNext.getUpperRange()){
                input.remove(i+1);
            }else if(zip.getUpperRange() > zipNext.getLowerRange() ){
                zip.setUpperRange(zipNext.getUpperRange());
                input.remove(i+1);
            }
        }
        return input;
    }

    public static void printZipRanges(List<ZipRange> minimumRangeRestrictions){
        for (ZipRange it3: minimumRangeRestrictions) {
            System.out.print(it3);

        }

    }
}
