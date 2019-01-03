package board;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Place {
    private int x, y;
    private int value = -1;
    private List<Integer> possibleList = new ArrayList<>();
    private boolean hasValue = false;

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
        removeValueFromPossibleList(value);
        hasValue = true;

    }

    public String getPosition() {
        return "" + x + y;
    }

    public String getValue() {
        if (value != -1) {
            return Integer.toString(value);
        } else {
            return " ";
        }
    }

    public boolean hasValue() {
        return hasValue;
    }

    public void removeValueFromPossibleList(int value) {

        for (int i=0; i < possibleList.size(); i++) {
            if (value == possibleList.get(i)) {
                possibleList.remove(i);
            }
        }
    }

    public List<Integer> getPossibleList() {
        return possibleList;
    }

    public void showPossibleValue() {
        System.out.print("Possible values to position " + getPosition() + " - ");
        possibleList.stream()
                .map(num -> ("[" + num + "]"))
                .forEach(System.out::print);
        System.out.print("\n");
    }
}
