package rpsv1;

import java.util.Random;


public class Game {
    private Statistic stat;
    private User user;
    private int numbersOfGames;


    public Game(User user, int numberOfGames, Statistic stat) {
        this.user = user;
        this.numbersOfGames = numberOfGames;
        this.stat = stat;
    }

    public void startGame() {

        int userWinsStat = 0;
        int compWinsStat = 0;
        int numbersOfTie = 0;
        int count = 0;
        while (numbersOfGames != 0) {

            user.chooseUserPlayer();
            String userName = user.getUserName();

            ComputerPlayer cp = new ComputerPlayer();
            PlayerInfo computerPlayer = cp.getComputerPlayer();

           // String cPlayer = computerPlayer.getPlayerName();
            String uPlayer = user.getUserPlayer().getPlayerName();
            String cPlayer = computerPlayer.getPlayerName();

            System.out.println(userName + " show [" + uPlayer + "] | Computer show [" + cPlayer + "]");

            if (cPlayer == uPlayer) {
                System.out.println("We have tie.\n");
                numbersOfTie++;

            } else {
                if (computerPlayer.gameResult(uPlayer)) {
                    System.out.println("Computer win!\n");
                    compWinsStat++;
                } else {
                    System.out.println("Gratulation! " + userName + " you win!\n");
                    userWinsStat++;
                }
            }
            numbersOfGames--;
            stat.setUserWins(userWinsStat);
            stat.setComputerWins(compWinsStat);
            stat.setNumbersTie(numbersOfTie);
        }
        System.out.println(count);
        stat.getStatistic(user);
    }
}

