package board;

import java.util.List;

public class SudokuEngine {
    private Board board;
    private ValueSetter valueSetter;
    private List<List<Place>> startBoard;
    private Place startPlace;

    public SudokuEngine(Game game) {
        this.board = game.getBoard();
        this.valueSetter = game.getValueSetter();
    }


    public boolean resolveSudoku() {

        Place place;

        for (int row = 1; row < 10; row++) {
            for (int column = 1; column < 10; column++) {
                place = board.getPlace(column, row);
                if (place.hasValue() == false) {
                    for (int num = 1; num < 10; num++) {
                        if (valueSetter.checkPossibleSet(place, num)) {
                            place.setValue(num);
                            if (resolveSudoku()) {
                                return true;
                            }
                            place.removeValueAfterWrongSet(num);
                            place.wrongSet();
                        }
                    }
                    return false;
                }
            }
        }
        board.showBoard("Value");
        return true;


    }


        public int setPossibleValue (Place place){

            int possibleNumber = 0;

            boolean canSet = false;
            int counter = 1;

            while (!canSet && counter < 10) {
                if (valueSetter.checkPossibleSet(place, counter)) {
                    possibleNumber = counter;
                    canSet = true;
                }
                counter++;
            }

            return possibleNumber;
        }
    }
