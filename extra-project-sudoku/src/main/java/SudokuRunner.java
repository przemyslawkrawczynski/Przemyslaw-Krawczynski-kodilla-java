import board.Board;
import board.BoardGenerator;
import board.UserDecision;
import java.util.Scanner;

public class SudokuRunner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Sudoku");
        Board board = new Board(new BoardGenerator());
        UserDecision userDecision = new UserDecision(board);
        userDecision.getFillBoard().showBoard();


    }
}
