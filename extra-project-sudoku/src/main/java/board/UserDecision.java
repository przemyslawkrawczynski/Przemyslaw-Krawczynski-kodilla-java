package board;

import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UserDecision {

    private boolean readyToSolve = false;
    private boolean stillPlay = true;

    public boolean askStillPlay() {
        Scanner in = new Scanner(System.in);
        boolean correctChoice = false;
        System.out.println("Do you want resolve another Sudoku [Y]/[N]");

        while (!correctChoice) {
            String value = in.nextLine();
            System.out.println("[" + value + "]");
            switch (value.toUpperCase()) {
                case "Y":
                    stillPlay = true;
                    correctChoice = true;
                    readyToSolve = false;
                    break;
                case "N":
                    stillPlay = false;
                    correctChoice = true;
                    break;
                default:
                    System.out.println("Wrong answer..");
            }
        }

        return stillPlay;
    }

        public Board getFillBoard(Board board) {

        System.out.println("Bellow are list coordinates where first number are [COLUMN] number, and second are [ROW] number.");
        board.showBoard("Position");


        while (!readyToSolve) {

            List<List<Place>> placePosition = board.getBoard();
            String[] result = new String[3];
            boolean correctChoice = false;
            String value = null;

            Scanner in = new Scanner(System.in);

            while (!correctChoice) {

                System.out.println("Enter number to table -> [Column Row Value] numbers 1-9");
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
                    System.out.println("Unexpected format [you give less or more than 3 arguments 1] - Correct format -> Row Column Value");
                }
            }
            System.out.println("Your choice [Row: " + result[0] + "] [Column: " + result[1] + "] - value [" + result[2] + "]");

            int x = Integer.parseInt(result[0]);
            int y = Integer.parseInt(result[1]);
            int v = Integer.parseInt(result[2]);

            board.getPlace(x, y).setValue(v);
            board.removeValueInRowAfterSet(y, v);
            board.removeValueInColumnAfterSet(x, v);
            board.removeValueInSmallBoardAfterSet(board.getPlace(x,y),v);


            System.out.println("Do you want set another position? [Y]/[N]");
            boolean setAnotherPositon = false;

            while (!setAnotherPositon) {
                value = in.nextLine();
                System.out.println("[" + value + "]");
                switch (value.toUpperCase()) {
                    case "Y":
                        readyToSolve = false;
                        setAnotherPositon = true;
                        break;
                    case "N":
                        readyToSolve = true;
                        setAnotherPositon = true;
                        break;
                    default:
                        System.out.println("Wrong answer..");
                }
            }
        }
        return board;
    }

    public boolean isStillPlay() {
        return stillPlay;
    }
}
