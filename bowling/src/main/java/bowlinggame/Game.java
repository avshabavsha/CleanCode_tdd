package bowlinggame;

/**
 * Created by avshalomMac on 03/03/2018.
 */
public class Game {
    private int score = 0;

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }
}
