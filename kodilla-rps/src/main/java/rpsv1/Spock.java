package rpsv1;

public class Spock implements PlayerInfo {

    @Override
    public String getPlayerName() {
        return "Spock";
    }

    @Override
    public String getPlayerSkills() {
        return "Spock wins with Scissors and Stone, and loses with Lizard and Paper.";
    }

    @Override
    public boolean gameResult(String player) {
        if(player.equals("Scissors") || player.equals("Stone")) {
            return true;
        } else {
            return false;
        }
    }
}