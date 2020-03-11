package com.kata.tennis;

public class TennisGame {

    private Player[] players = new Player[2];

    TennisGame(){
        players[0] = new Player();
        players[1] = new Player();
    }

    public String getScore() {
        if(players[1].getPlayerScore() == 1){return "Love, Fifteen";}
        if(players[0].getPlayerScore() == 1){return "Fifteen, Love";}
        return "Love All";
    }

    public void playerOneScoresPoint() {
        players[0].playerScoresPoint();
    }

    public void playerTwoScoresPoint() {
        players[1].playerScoresPoint();
    }
}