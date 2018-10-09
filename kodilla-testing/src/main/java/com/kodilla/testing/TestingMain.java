package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){

        Calculator count = new Calculator(10,12);

        int resultAdd = count.add();
        int resultSubstract = count.substract();

        if (resultAdd == 22){
            System.out.println("Test result correct -> " + count.getA() + " + " + count.getB() + " = " + resultAdd);
        } else {
            System.out.println("Test result error -> "  + count.getA() + " + " + count.getB() + " = " + resultAdd + "\n");
        }

        if (resultSubstract == -2){
            System.out.println("Test result correct -> " + count.getA() + " - " + count.getB() + " = " + resultSubstract);
        } else {
            System.out.println("Test result: error (-> " + count.getA() + " - " + count.getB() + " = " + resultSubstract);
        }
    }
}
