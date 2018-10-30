package main;

import io.FileReader;
import io.FileReaderException;
import io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {
    public static void main(String args[]) {
        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while fileOperation file!");
        }
    }
}