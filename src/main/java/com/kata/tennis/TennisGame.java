package com.kata.tennis;

public class TennisGame {
    private int playerOneScore;

    public String getScore() {
        if(playerOneScore == 1){return "Fifteen, Love";}
        return "Love All";
    }

    public void playerOneScoresPoint() {
        playerOneScore++;
    }
}
