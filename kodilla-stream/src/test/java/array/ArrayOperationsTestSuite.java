package array;
import org.junit.Assert;
import org.junit.Test;
import stream.array.ArrayOperations;

import static stream.array.ArrayOperations.getAvarage;

public class ArrayOperationsTestSuite implements ArrayOperations {
    @Test
    public void testGetAvarage() {

        int[] numbers = new int[20];

        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 12;
        numbers[3] = 6;
        numbers[4] = 1;
        numbers[5] = 2;
        numbers[6] = 11;
        numbers[7] = 2;
        numbers[8] = 1;
        numbers[9] = 2;
        numbers[10] = 13;
        numbers[11] = 2;
        numbers[12] = 1;
        numbers[13] = 2;
        numbers[14] = 16;
        numbers[15] = 2;
        numbers[16] = 1;
        numbers[17] = 12;
        numbers[18] = 1;
        numbers[19] = 2;

        double result = getAvarage(numbers);
        double expectedResult = 4.65;

        Assert.assertEquals(expectedResult, result, 0.1);

    }
}
