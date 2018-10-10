package com.kodilla.testing.collections;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> newNumbers = new ArrayList<Integer>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                newNumbers.add(numbers.get(i));
            }

        }
        return newNumbers;
    }
}

