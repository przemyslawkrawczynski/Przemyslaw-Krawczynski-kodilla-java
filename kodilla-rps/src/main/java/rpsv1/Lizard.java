package rpsv1;

public class Lizard implements PlayerInfo {

    @Override
    public String getPlayerName() {
        return "Lizard";
    }

    @Override
    public String getPlayerSkills() {
        return "Lizard wins with Paper and Spock, and loses with Scissors and Stone.";
    }

    @Override
    public boolean gameResult(String player) {
        if(player.equals("Paper") || player.equals("Spock")) {
            return true;
        } else {
            return false;
        }
    }
}

