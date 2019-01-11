package board;

import java.util.Scanner;

public class ScannerSingleton {
    private static ScannerSingleton scannerSingleton = null;
    private Scanner scanner = new Scanner(System.in);

    private ScannerSingleton() {}

    public static ScannerSingleton getInstance() {
        if (scannerSingleton == null) {
            synchronized (ScannerSingleton.class) {
                if (scannerSingleton == null) {
                    scannerSingleton = new ScannerSingleton();
                }
            }
        }
        return scannerSingleton;
    }

    public void closeScanner() {
        scanner.close();
    }

    public Scanner getScanner() {
        return scanner;
    }

}
