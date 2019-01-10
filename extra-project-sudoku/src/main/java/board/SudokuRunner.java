import board.*;

import java.util.List;
import java.util.Scanner;

public class SudokuRunner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Sudoku");

        UserDecision userDecision = new UserDecision();

        while (userDecision.isStillPlay()) {
            BoardGenerator boardGenerator = new BoardGenerator();
            Game game = boardGenerator.newGame();
            userDecision.getFillBoard(game.getBoard());
            game.getBoard().showBoard("Value");
            System.out.println("-------------------");
            SudokuEngine sudokuEngine = new SudokuEngine(game);
            sudokuEngine.resolveSudoku();
            userDecision.askStillPlay();
        }

//        game.getBoard().setValue(1,2,8);
//        game.getBoard().setValue(2,1,2);
//        game.getBoard().setValue(2,3,3);
//        game.getBoard().setValue(4,1,5);
//        game.getBoard().setValue(4,2,2);
//        game.getBoard().setValue(6,2,3);
//        game.getBoard().setValue(6,1,1);
//        game.getBoard().setValue(5,3,6);
//        game.getBoard().setValue(8,1,9);
//        game.getBoard().setValue(8,3,7);
//        game.getBoard().setValue(9,2,6);
//        game.getBoard().setValue(7,4,6);
//        game.getBoard().setValue(7,6,7);
//        game.getBoard().setValue(8,5,1);
//        game.getBoard().setValue(3,6,2);
//        game.getBoard().setValue(1,5,5);
//        game.getBoard().setValue(2,5,4);
//        game.getBoard().setValue(3,4,1);
//        game.getBoard().setValue(1,8,2);
//        game.getBoard().setValue(2,7,9);
//        game.getBoard().setValue(2,9,1);
//        game.getBoard().setValue(4,8,8);
//        game.getBoard().setValue(4,9,9);
//        game.getBoard().setValue(5,7,3);
//        game.getBoard().setValue(6,8,4);
//        game.getBoard().setValue(8,7,8);
//        game.getBoard().setValue(9,8,7);
//        game.getBoard().setValue(8,9,6);
//        game.getBoard().setValue(6,9,7);
//        game.getBoard().setValue(9,5,9);

    }
}
