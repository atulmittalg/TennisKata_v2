package com.kata.tennis;

public class TennisGame {
    private int playerOneScore;
    private int playerTwoScore;

    public String getScore() {
        if(playerTwoScore == 1){return "Love, Fifteen";}
        if(playerOneScore == 1){return "Fifteen, Love";}
        return "Love All";
    }

    public void playerOneScoresPoint() {
        playerOneScore++;
    }

    public void playerTwoScoresPoint() {
        playerTwoScore++;
    }
}
