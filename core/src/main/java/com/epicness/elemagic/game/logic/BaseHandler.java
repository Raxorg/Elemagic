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
        stuff.getLifeText().setText("Lives : 10");
        lives = stuff.getLives();
        for (int i = 0; i < 10; i++) {
            SpritePlus life = new SpritePlus(sharedAssets.getSquare32());
            life.setPosition(BATTLEFIELD_SIZE+5f, VIEWPORT_HEIGHT - 75f - i * 29f);
            life.setColor(YELLOW);
            life.setSize(25f);
            lives.add(life);
        }
    }

    public void loseLife() {
        if (lives.isEmpty()) {

            stuff.getLifeText().setText("Game Over :(");
            return;
        }


        lives.pop();

        stuff.getLifeText().setText("Lives : "+lives.size);
    }
}