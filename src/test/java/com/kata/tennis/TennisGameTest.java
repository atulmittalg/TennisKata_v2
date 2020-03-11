package com.kata.tennis;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TennisGameTest {
    @Test
    public void getScoreShouldReturnLoveAllAtTheStartOfGame(){
        TennisGame tennisGame = new TennisGame();
        assertEquals("Love All", tennisGame.getScore());
    }
}
