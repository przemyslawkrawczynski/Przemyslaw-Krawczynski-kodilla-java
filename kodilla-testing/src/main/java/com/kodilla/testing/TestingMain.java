package com.kodilla.testing;

import com.kodilla.testing.collections.OddNumbersExterminator;

import java.util.ArrayList;

public class TestingMain {
    public static void main(String[] args){

        ArrayList<Integer> testArray = new ArrayList<Integer>();
        testArray.add(1);
        testArray.add(2);
        testArray.add(3);
        testArray.add(4);
        testArray.add(5);
        testArray.add(6);

        OddNumbersExterminator test = new OddNumbersExterminator();
        ArrayList testingArray = test.exterminate(testArray);

        for(int i=0; i < testingArray.size(); i++) {
            System.out.println("Parzysta liczba: " + testingArray.get(i));
        }


    }
}
