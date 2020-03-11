package com.kata.tennis;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TennisGameTest {

    private TennisGame tennisGame;

    @Before
    public void initializeTennisGameObject(){
        tennisGame = new TennisGame();
    }

    @Test
    public void getScoreShouldReturnLoveAllAtTheStartOfGame(){
        assertEquals("Love All", tennisGame.getScore());
    }

    @Test
    public void getScoreShouldReturnFifteenLoveWhenPlayerOneScoresOnePoint(){
        tennisGame.playerOneScoresPoint();
        assertEquals("Fifteen, Love", tennisGame.getScore());
    }

    @Test
    public void getScoreShouldReturnLoveFifteenWhenPlayerTwoScoresFirstPoint(){
        tennisGame.playerTwoScoresPoint();
        assertEquals("Love, Fifteen", tennisGame.getScore());
    }
}