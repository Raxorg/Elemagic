package com.epicness.elemagic.game.logic;

import com.epicness.fundamentals.stuff.Text;

public class ScoreHandler extends GameLogicHandler {

    private Text scoreText;
    private int score;
    private boolean enabled;

    @Override
    protected void init() {
        scoreText = stuff.getScore();
        enabled = true;
    }

    public void addScore(int additionalScore) {
        if (!enabled) return;

        score += additionalScore;
        scoreText.setText("Score: " + score);
    }

    public void disable() {
        enabled = false;
    }
}