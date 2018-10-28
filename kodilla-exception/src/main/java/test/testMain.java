package test;

import java.time.LocalDate;

public class testMain {
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {

            double result = firstChallenge.divide(3, 0);

        } catch (ArithmeticException e) {

            System.out.println("You can`t divide by zero.");
            System.out.println(LocalDate.now() + " | We have exception -> " + e);

        }
    }
}
