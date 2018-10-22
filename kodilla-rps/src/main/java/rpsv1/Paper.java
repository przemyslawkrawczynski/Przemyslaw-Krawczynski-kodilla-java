package rpsv1;

public class Paper implements PlayerInfo {

    @Override
    public String getPlayerName() {
        return "Paper";
    }

    @Override
    public String getPlayerSkills() {
        return "Paper win with stone, and lose with scissors.";
    }

    @Override
    public boolean gameResult(String player) {
        if(player == "Stone") {
            return true;
        } else {
            return false;
        }
    }
}
