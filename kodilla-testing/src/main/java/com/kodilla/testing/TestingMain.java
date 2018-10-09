package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){

        Calculator count = new Calculator();

        int resultAdd = count.add(12,10);
        int resultSubstract = count.substract(11, 5);

        if (resultAdd == 22){
            System.out.println("Test result correct");
        } else {
            System.out.println("Test result error" + "\n");
        }

        if (resultSubstract == 6){
            System.out.println("Test result correct");
        } else {
            System.out.println("Test result error" + "\n");
        }
    }
}
