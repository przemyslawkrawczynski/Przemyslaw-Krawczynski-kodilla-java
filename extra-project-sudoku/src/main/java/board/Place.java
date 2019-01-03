package board;

         import java.util.Iterator;
         import java.util.List;
         import java.util.stream.IntStream;

public class Place {
    private int x,y;
    private String value;
    private List<Integer> possibleList;

    public Place(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void generateList() {
        IntStream.iterate(1, n -> n + 1)
                .limit(9)
                .forEach(n -> possibleList.add(n));
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPosition() {
        return "" + x + y;
    }
    public void checkNumber(List<Place> userChoiceValue) {}
}
