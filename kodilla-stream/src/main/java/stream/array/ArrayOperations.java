package stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
   static double getAvarage(int[] numbers) {
        int allElements = numbers.length;

        IntStream.range(0, allElements)
                .map(n -> numbers[n])
                .forEach(System.out::println);
        double result = IntStream.range(0, allElements)
                .map(n -> numbers[n])
                .average().getAsDouble();
        return result;
   }
}
