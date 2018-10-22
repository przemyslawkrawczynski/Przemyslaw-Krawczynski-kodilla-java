package rpsv1;

import java.util.Random;
import java.util.Scanner;

public class Run {

    public static void main(String args[]) {
        Random computerPlayerGenerator = new Random();

        for (int i = 1; i < 100; i++) {
            int computerChoice = computerPlayerGenerator.nextInt(4);
            System.out.println(computerChoice);
        }

    }
}