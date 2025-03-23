package com.epicness.elemagic.game.logic;

import static com.badlogic.gdx.graphics.Color.WHITE;

import com.epicness.fundamentals.stuff.SpritePlus;

public class EasterEggHandler extends GameLogicHandler {

    private SpritePlus easterEgg;

    @Override
    protected void init() {
        easterEgg = stuff.getEasterEgg();
    }

    @Override
    public void touchDown(float x, float y, int button) {
        if (easterEgg.contains(x, y)) {
            easterEgg.setSprite(assets.getStickerQR());
            easterEgg.setColor(WHITE);
        }
    }
}