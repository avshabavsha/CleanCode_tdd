package bowlinggame;

/**
 * Created by avshalomMac on 03/03/2018.
 */
public class Game {
    private int score = 0;
    private int rolls[] = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        for (int i = 0; i < rolls.length; i++) {
            if(rolls[i] + rolls[i+1] == 10)
            score += rolls[i];
        }
        return score;
    }
}
