package rpsv1;

public class Stone implements PlayerInfo {

    @Override
    public String getPlayerName() {
        return "Stone";
    }

    @Override
    public String getPlayerSkills() {
        return "Stone win with Scissors and Lizard, and lose with Paper and Spock.";
    }

    @Override
    public boolean gameResult(String player) {
        return player.equals("Scissors") || player.equals("Lizard");
    }
}

