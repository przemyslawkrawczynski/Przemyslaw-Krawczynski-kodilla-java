package rpsv1;

public class Paper implements PlayerInfo {

    @Override
    public String getPlayerName() {
        return "Paper";
    }

    @Override
    public String getPlayerSkills() {
        return "Paper wins with Stone and Spock, and loses with Scissors and Lizard.";
    }

    @Override
    public boolean gameResult(String player) {
        return player.equals("Stone") || player.equals("Spock");
    }
}
