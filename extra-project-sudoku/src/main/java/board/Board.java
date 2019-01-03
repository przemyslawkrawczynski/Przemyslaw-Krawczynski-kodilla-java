package board;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private BoardGenerator boardGenerator;
    private List<List<Place>> board = new ArrayList<>();

    public void showBoard() {
        for (int y = 0; y < 9; y++) {
            System.out.print("|");
            for (int x = 0; x < 9; x++) {
                System.out.print(board.get(y).get(x).getValue() + "|");
            }
            System.out.print("\n");
        }
    }

    public List<List<Place>> getBoard() {
        return board;
    }

    public Board(BoardGenerator boardGenerator) {
        this.boardGenerator = boardGenerator;
        this.board = boardGenerator.generateBoard();
    }

    public List<Place> getSingleRow(int rowNumber) {
        return board.get(rowNumber);
    }

    public Place getPlace(int x, int y ) {
        return getSingleRow(y-1).get(x-1);
    }

    public List<Integer> getRowValue(int y) {
        List<Integer> valueList = new ArrayList<>();
        getSingleRow(y).stream()
                .forEach(place -> valueList.add(Integer.parseInt(place.getValue())));
        return valueList;
    }

    public List<Integer> getColumnValue(int x) {
        List<Integer> valueList = new ArrayList<>();
        board.stream()
                .flatMap(e -> e.stream())
                .filter(place -> place.getPosition().startsWith(Integer.toString(x)))
                .forEach(place -> valueList.add(Integer.parseInt(place.getValue())));
        return valueList;
    }
}
