package rpsv1;
import java.util.Scanner;

public class RpsRunner {


    public static void main(String args[]) {
        String userName;
        int numbersOfPlay;
        PlayerInfo userChoicePlayer;
        boolean stillPlay = true;

        System.out.println("Welcome!");
        System.out.println("This is Stone/Paper/Scissors game!\n");
        System.out.println("Let`s start...\n");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter you Name:");
        userName = in.nextLine();
        User user = new User(userName);

        while (stillPlay) {

            System.out.println("How many games do you want to play? Enter number:");
            numbersOfPlay = in.nextInt();
            Statistic stat = new Statistic(numbersOfPlay);

            System.out.println("Lets play..\n");
            Game play = new Game(user, numbersOfPlay, stat);
            play.startGame();

//            if (!user.userStillPlayDecisions()){
//                if (!user.userQuitDecisions()){
//                    System.out.println("Good decision, let`s play Again!\n");
//                    stillPlay = true;
//                } else {
//                    stillPlay = false;
//                }
//            }
            if (!user.userStillPlayDecisions() && user.userQuitDecisions()) {
                stillPlay = false;
            } else {
                System.out.println("Good decision, let`s play Again!\n");
            }
        }
        System.out.println(user.getUserName() + " thank you for game!");
        in.close();
    }
}

