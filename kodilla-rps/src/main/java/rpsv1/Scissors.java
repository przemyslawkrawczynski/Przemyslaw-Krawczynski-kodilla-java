package rpsv1;

public class Scissors implements PlayerInfo {

    @Override
    public String getPlayerName() {
        return "Scissors";
    }

    @Override
    public String getPlayerSkills() {
        return "Scissors win with paper, and lose with stone.";
    }

    @Override
    public boolean gameResult(String player) {
        if(player == "Paper") {
            return true;
        } else {
            return false;
        }
    }
}
