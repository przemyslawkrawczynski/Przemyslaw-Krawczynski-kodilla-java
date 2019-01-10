package board;

public class BoardGenerator {

    public Game newGame() {

        PlaceGenerator placeGenerator = new PlaceGenerator();
        Board board = new Board(placeGenerator);
        ValueSetter valueSetter = new ValueSetter(board);

        Game game = new Game(board, valueSetter);

        return game;
    }
}
