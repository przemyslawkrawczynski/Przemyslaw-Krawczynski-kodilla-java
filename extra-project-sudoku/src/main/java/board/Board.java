package board;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Board {

    private PlaceGenerator placeGenerator;
    private List<List<Place>> board = new ArrayList<>();
    private SmallBoard smallBoard = new SmallBoard();


    public void showBoard(String type) {
        for (int y = 0; y < 9; y++) {
            System.out.print("|");
            for (int x = 0; x < 9; x++) {
                if (type.equals("Value")) {
                    System.out.print(board.get(y).get(x).getValue() + "|");
                } else if (type.equals("Position")) {
                    System.out.print(board.get(y).get(x).getPosition() + "|");
                } else if (type.equals("hasValue")) {
                    String hasValue = board.get(y).get(x).hasValue() ? "T" : "F";
                    System.out.print(hasValue + "|");
                } else {
                    System.out.print(board.get(y).get(x).getValue() + "|");
                }
            }
            System.out.print("\n");
        }
    }

    public List<List<Place>> getBoard() {
        return board;
    }

    public Board(PlaceGenerator placeGenerator) {
        this.placeGenerator = placeGenerator;
        this.board = placeGenerator.generatePlace();
        smallBoard.createSmallBoard(board);

    }

    public SmallBoard getSmallBoard() {
        return this.smallBoard;
    }

    public List<Place> getSingleRow(int rowNumber) {
        return board.get(rowNumber - 1);
    }

    public List<Place> getSingleColumn(int columnNumber) {
        List<Place> singleColumn = board.stream()
                .flatMap(list -> list.stream())
                .filter(place -> place.getPosition().startsWith((Integer.toString(columnNumber))))
                .collect(toList());

        return singleColumn;
    }

    public Place getPlace(int column, int row ) {
        return getSingleRow(row).get(column-1);
    }

    public void removeValueInColumnAfterSet(int column, int value) {
        getSingleColumn(column).stream()
                .filter(place -> place.hasValue()==false)
                .forEach(place -> place.addValueToNotExpectedList(value));
    }

    public void removeValueInRowAfterSet(int row, int value) {
        getSingleRow(row).stream()
                .filter(place -> place.hasValue()==false)
                .forEach(place -> place.addValueToNotExpectedList(value));
    }

    public void removeValueInSmallBoardAfterSet(Place p, int value) {
        smallBoard.getSingleBoardPlaces(p).stream()
                .filter(place -> place.hasValue()==false)
                .forEach(place -> place.addValueToNotExpectedList(value));
    }

    public void setValue(int x, int y, int v) {
        getPlace(x, y).setValue(v);
        removeValueInRowAfterSet(y, v);
        removeValueInColumnAfterSet(x, v);
        removeValueInSmallBoardAfterSet(getPlace(x,y),v);
    }
}
