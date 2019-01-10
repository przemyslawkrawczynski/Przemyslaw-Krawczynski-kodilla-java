package board;

public class Game {

    private Board board;
    private ValueSetter valueSetter;

    public Game(Board board, ValueSetter valueSetter) {
        this.board = board;
        this.valueSetter = valueSetter;
    }

    public Board getBoard() {
        return board;
    }

    public ValueSetter getValueSetter() {
        return valueSetter;
    }
}
