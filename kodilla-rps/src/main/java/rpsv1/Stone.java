package rpsv1;

public class Stone implements PlayerInfo {

    @Override
    public String getPlayerName() {
        return "Stone";
    }

    @Override
    public String getPlayerSkills() {
        return "Stone win with scissors, and lose with paper.";
    }

    @Override
    public boolean gameResult(String player) {
        if(player.equals("Scissors")) {
            return true;
        } else {
            return false;
        }
    }
}

