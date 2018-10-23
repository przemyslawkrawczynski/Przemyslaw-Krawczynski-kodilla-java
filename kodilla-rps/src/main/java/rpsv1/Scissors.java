package rpsv1;

public class Scissors implements PlayerInfo {

    @Override
    public String getPlayerName() {
        return "Scissors";
    }

    @Override
    public String getPlayerSkills() {
        return "Scissors wins with Paper and Lizard, and loses with Stone and Spock.";
    }

    @Override
    public boolean gameResult(String player) {
        return player.equals("Paper") || player.equals("Lizard");
    }
}
