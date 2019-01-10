package board;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PlaceGenerator {

        private List<List<Place>> board = new ArrayList<>();

        public List<Place> generateRow(int y) {
            List<Place> singleRow = new ArrayList<>();
            IntStream.iterate(0, x -> x+1)
                    .limit(9)
                    .forEach(x -> singleRow.add(new Place(x + 1, y+1)));

            return singleRow;
        }

        public List<List<Place>> generatePlace() {
            IntStream.iterate(0, y -> y+1)
                    .limit(9)
                    .forEach(y -> board.add(generateRow(y)));
            return board;
        }

    }