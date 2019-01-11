package board;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ValueSetter {

    private Board board;
    private SmallBoard smallBoard;

    public ValueSetter(Board board) {
        this.board = board;
        this.smallBoard = board.getSmallBoard();
    }

    public Set<Place> getNonExpectedList(Place place) {

        int column = place.getX();
        int row = place.getY();

        Set<Place> allPlacesColumnAndRow = new HashSet<>();

        board.getSingleColumn(column).stream()
                .filter(p -> p.hasValue())
                .forEach(p -> allPlacesColumnAndRow.add(p));

        board.getSingleRow(row).stream()
                .filter(p -> p.hasValue())
                .forEach(p -> allPlacesColumnAndRow.add(p));


        smallBoard.getSingleBoardPlaces(place).stream()
                .filter(p -> p.hasValue())
                .forEach(p -> allPlacesColumnAndRow.add(p));

        return allPlacesColumnAndRow;

    }

    public boolean checkPossibleSet(Place actualPlace, int value) {


        Set<Place> allPlaces = getNonExpectedList(actualPlace);
        ArrayList<Integer> nonExpectedValue  = new ArrayList<>();

        allPlaces.stream()
                .map(place -> Integer.parseInt(place.getValue()))
                .forEach(place -> nonExpectedValue.add(place));

        boolean canSet = true;

        for (int i=0; i<nonExpectedValue.size(); i++) {
             if (nonExpectedValue.get(i) == value) {
                 canSet = false;
             }
        }


        return canSet;
    }

}

