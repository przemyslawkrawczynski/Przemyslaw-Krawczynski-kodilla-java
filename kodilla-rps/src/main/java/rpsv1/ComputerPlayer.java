package rpsv1;

import java.util.Random;

public class ComputerPlayer {
    private PlayerInfo computerPlayer;

    public PlayerInfo getComputerPlayer() {

        Random computerPlayerGenerator = new Random();
        int computerChoice = computerPlayerGenerator.nextInt(5);

        switch (computerChoice) {
            case 0:
                this.computerPlayer = new Stone();
                break;
            case 1:
                this.computerPlayer = new Paper();
                break;
            case 2:
                this.computerPlayer = new Scissors();
                break;
            case 3:
                this.computerPlayer = new Spock();
                break;
            case 4:
                this.computerPlayer = new Lizard();
                break;
        }

        return computerPlayer;
    }
}
