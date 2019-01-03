import board.Board;
import board.BoardGenerator;
import board.Place;

import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SudokuRunner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Sudoku");
        Board board = new Board(new BoardGenerator());
        board.showBoard();
        List<List<Place>> placePosition = board.getBoard();



        String[] result = new String[3];
        boolean correctChoice = false;
        String value = null;

        while (!correctChoice) {

            System.out.println("Enter number to table -> [Row Column Value] numbers 1-9");
            value = in.nextLine();
            StringTokenizer userChoice = new StringTokenizer(value, " ");

            int num = 0;

            String actualToken;

            if (userChoice.countTokens() == 3) {
                while (userChoice.hasMoreTokens()) {
                    correctChoice = false;
                    actualToken = userChoice.nextToken();

                    if (actualToken.length() < 2) {
                        result[num] = actualToken;
                        num++;
                        correctChoice = true;
                    } else {
                        System.out.println("Unexpected format - Enter number to table -> Row Column Value");
                        break;
                    }

                }
            } else {
                System.out.println("Unexpected format you give less or more than 3 arguments 1- Enter number to table -> Row Column Value");
            }
        }
        System.out.println("Your choice [Row: " + result[0] + "] [Column: " + result[1] + "] - value [" + result[2] + "]");

        int x = Integer.parseInt(result[0]);
        int y = Integer.parseInt(result[1]);
        int v = Integer.parseInt(result[2]);

        board.getPlace(x, y).setValue(v);
        board.getPlace(x, y).getPossibleList().stream().forEach(System.out::println);

        System.out.println("-------------------------------");
        board.getColumnValue(1).stream().forEach(System.out::println);

        board.showBoard();
    }
}
