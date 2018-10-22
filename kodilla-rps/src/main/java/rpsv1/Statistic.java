package rpsv1;

public class Statistic {
    private int numbersOfPlay;
    private int computerWins;
    private int userWins;
    private int numbersTie;

    public Statistic(int numbersOfPlay) {
        this.numbersOfPlay = numbersOfPlay;
    }

    public int getNumbersOfPlay() {
        return numbersOfPlay;
    }

    public void setNumbersOfPlay(int numbersOfPlay) {
        this.numbersOfPlay = numbersOfPlay;
    }

    public int getComputerWins() {
        return computerWins;
    }

    public void setComputerWins(int computerWins) {
        this.computerWins = computerWins;
    }

    public int getUserWins() {
        return userWins;
    }

    public void setUserWins(int userWins) {
        this.userWins = userWins;
    }

    public int getNumbersTie() {
        return numbersTie;
    }

    public void setNumbersTie(int numbersTie) {
        this.numbersTie = numbersTie;
    }

    public void getStatistic(User user) {

        double uW = userWins;
        double nOP = numbersOfPlay;

        double avarage = (uW/nOP) * 100;

        System.out.println("Total games : " + getNumbersOfPlay() + " | [" + user.getUserName() + "] wins : " + userWins +".");
        System.out.println(user.getUserName() + " have " + avarage + "% successful games.\n");
    }
}
