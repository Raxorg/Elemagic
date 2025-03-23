package com.epicness.elemagic.game.logic;

import com.epicness.fundamentals.stuff.Text;

public class TextHandler extends GameLogicHandler {

    private Text scoreText;
    private int score;

    @Override
    protected void init() {
        scoreText = stuff.getScore();
    }

    public void addScore(int additionalScore) {
        score += additionalScore;
        scoreText.setText("Score: " + score);
    }
}