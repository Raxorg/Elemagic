package com.epicness.elemagic.game.logic;

import static com.badlogic.gdx.graphics.Color.YELLOW;
import static com.epicness.elemagic.game.constants.GameConstants.BATTLEFIELD_SIZE;
import static com.epicness.fundamentals.constants.SharedConstants.VIEWPORT_HEIGHT;

import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.fundamentals.stuff.SpritePlus;

public class BaseHandler extends GameLogicHandler {

    private SnapshotArray<SpritePlus> lives;

    @Override
    protected void init() {
        lives = stuff.getLives();
        for (int i = 0; i < 10; i++) {
            SpritePlus life = new SpritePlus(sharedAssets.getSquare32());
            life.setPosition(BATTLEFIELD_SIZE, VIEWPORT_HEIGHT - 25f - i * 50f);
            life.setColor(YELLOW);
            life.setSize(25f);
            lives.add(life);
        }
    }

    public void loseLife() {
        lives.pop();
        if (lives.isEmpty()) {
            // game over
        }
    }
}