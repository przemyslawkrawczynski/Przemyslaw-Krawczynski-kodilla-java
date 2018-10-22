package rpsv1;

import java.util.Scanner;

public class User {
    private String userName;
    private PlayerInfo userPlayer;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public PlayerInfo getUserPlayer() {
        return userPlayer;
    }


    public boolean userQuitDecisions() {

        boolean correctDecision = false;
        boolean returnAnswer = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Are you sure to want to quit? [Y/N]");

        while(!correctDecision) {
            String decision = in.next().toUpperCase();

            if (decision.equals("Y")) {
                correctDecision = true;
                returnAnswer = true;
            } else if (decision.equals("N")) {
                correctDecision = true;
                returnAnswer = false;
            } else {
                System.out.println("Please choose correct answer [Y/N]");
                correctDecision = false;
            }
        }
        return returnAnswer;
    }

    public boolean userStillPlayDecisions() {

        boolean correctAnswer = false;
        boolean returnAnswer = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want play again? [Y/N]");

        while(!correctAnswer) {
            String decision = in.next().toUpperCase();

            if (decision.equals("Y")) {
                correctAnswer = true;
                returnAnswer = true;
            } else if (decision.equals("N")) {
                correctAnswer = true;
                returnAnswer = false;
            } else {
                System.out.println("Please choose correct answer [Y/N]");
                correctAnswer = false;
            }
        }
        return returnAnswer;
    }

    public void chooseUserPlayer() {

        boolean corretChoice = false;
        System.out.println("Choose player to game. -> [1] - Scissors | [2] - Stone | [3] - Paper" );

        while (!corretChoice) {

            Scanner in = new Scanner(System.in);
            int userChoice = in.nextInt();

            switch (userChoice) {
                case 1:
                    userPlayer = new Scissors();
                    System.out.print("You choose Scissors to game. ");
                    System.out.println("There are Scissors skills: " + userPlayer.getPlayerSkills() + "\n");
                    corretChoice = true;
                    break;

                case 2:
                    userPlayer = new Stone();
                    System.out.print("You choose Stone to game. ");
                    System.out.println("There are Stone skills: " + userPlayer.getPlayerSkills()+ "\n");
                    corretChoice = true;
                    break;

                case 3:
                    userPlayer = new Paper();
                    System.out.print("You choose Paper to game. ");
                    System.out.println("There are Scissors skills: " + userPlayer.getPlayerSkills() + "\n");
                    corretChoice = true;
                    break;
                default:
                    System.out.println("You don`t choose correct, please try again.");
                    System.out.println("[1] - Scissors | [2] - Stone | [3] - Paper.");
            }
        }
    }

}