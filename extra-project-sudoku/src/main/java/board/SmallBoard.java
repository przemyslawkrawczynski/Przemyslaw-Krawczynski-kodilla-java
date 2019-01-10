package board;

import java.util.ArrayList;
import java.util.List;

public class SmallBoard {

    private List<List<Place>> smallBoardList = new ArrayList<>();

    public void createSmallBoard(List<List<Place>> boardList) {
        int startColumn = 1;
        int startRow = 1;

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                List<Place> singleSmallBoard = new ArrayList<>();
                for (int column = startColumn; column < startColumn + 3; column++) {
                    for (int row = startRow; row < startRow + 3; row++) {
                        singleSmallBoard.add(boardList.get(row-1).get(column-1));
                    }
                }
                startColumn = startColumn + 3;
                smallBoardList.add(singleSmallBoard);
            }
            startColumn = 1;
            startRow = startRow + 3;
        }
    }

    public List<List<Place>> getSmallBoardList() {
        return smallBoardList;
    }

    public List<Place> getSingleBoardPlaces(Place place) {
        List<Place> singleBoardPlaces = new ArrayList<>();

        for (int j =0; j < smallBoardList.size(); j++) {
            List<Place> actualPlaces = smallBoardList.get(j);
            for (int i=0; i<actualPlaces.size(); i++) {
                Place checkedPlace = actualPlaces.get(i);
                if (checkedPlace.equals(place)) {
                    singleBoardPlaces = actualPlaces;
                }
            }
       }
        return singleBoardPlaces;
    }
}

