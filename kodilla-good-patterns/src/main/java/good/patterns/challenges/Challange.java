package good.patterns.challenges;

import java.util.stream.Collectors;

public class Challange {
        public static void main(String args[]) {
        MovieStore movieStore = new MovieStore();

        // 1 version
            movieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .map(e -> e+"!")
                .forEach(System.out::print);

        // 2 version
            String info = movieStore.getMovies().entrySet().stream()
                    .flatMap(e -> e.getValue().stream())
                    .collect(Collectors.joining("!","",""));

            System.out.println("\n" + info);

    }
}
