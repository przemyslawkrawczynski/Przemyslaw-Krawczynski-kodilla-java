package codewars;

import java.io.IOException;
import java.util.StringTokenizer;

public class CodeWarsMain {
    public static void main (String[] args) {
        String num = "0 0 1 5";
        StringTokenizer numbers = new StringTokenizer(num, " ");
        int min = Integer.parseInt(numbers.nextToken());
        int max = min;
        while(numbers.hasMoreTokens()) {
            int actNumber = Integer.parseInt(numbers.nextToken());
            if (actNumber < min) {
                min = actNumber;
            } else {
                if (actNumber > max) {
                    max = actNumber;
                }
            }
        }

        System.out.println(min + " " + max);
    }
}
