package board;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Place {
    private int x, y;
    private int value = -1;
    private List<Integer> possibleList = new ArrayList<>();

    public Place(int x, int y) {
        this.x = x;
        this.y = y;
        generateList();
    }

    public void generateList() {
        IntStream.iterate(1, n -> n + 1)
                .limit(9)
                .forEach(n -> possibleList.add(n));
    }

    public void setValue(int value) {
        this.value = value;
        possibleList.remove(value - 1);
    }

    public String getPosition() {
        return "" + x + y;
    }

    public String getValue() {
        if (value != -1) {
            return Integer.toString(value);
        } else {
            return Integer.toString(value);
        }
    }

    public List<Integer> getPossibleList() {
        return possibleList;
    }

    public void checkNumber(List<Place> userChoiceValue) {
    }
}
