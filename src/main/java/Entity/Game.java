package main.java.Entity;

import java.sql.Timestamp;

/**
 * Created by Olivier on 29/06/2017.
 */
public class Game {
    private int score;
    private Timestamp timestampStartGame;

    public Game(){
        score = 0;
        timestampStartGame = new Timestamp(System.currentTimeMillis());
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Timestamp getTimestampStartGame() {
        return timestampStartGame;
    }

    public void setTimestampStartGame(Timestamp timestampStartGame) {
        this.timestampStartGame = timestampStartGame;
    }
}
