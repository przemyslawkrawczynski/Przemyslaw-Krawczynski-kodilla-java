package test;

import java.io.IOException;
import java.time.LocalDate;

public class testMain {
    public static void main(String[] args) throws IOException {

        FirstChallenge firstChallenge = new FirstChallenge();
        ArithmeticException ex = null;

        try {

           double result = firstChallenge.divide(3, 0);

        } catch (ArithmeticException e) {

            System.out.println("You can`t divide by zero.");
            ex = e;

        } finally {
            LocalDate date = LocalDate.now();

            if (ex != null) {
                System.out.println(date + " | We have exception -> " + ex);
            } else {
                System.out.println("Divide atributs were ok!");
            }
        }
    }
}
