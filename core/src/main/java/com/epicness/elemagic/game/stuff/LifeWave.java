package com.epicness.elemagic.game.stuff;

import static com.epicness.elemagic.game.constants.GameConstants.LIFE_WAVE_COLOR;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.fundamentals.rendering.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.SpritePlus;
import com.epicness.fundamentals.stuff.interfaces.SpriteBatchDrawable;

public class LifeWave implements SpriteBatchDrawable {

    private final SpritePlus sprite;
    public final float towerX, towerY;

    public LifeWave(Sprite waveSprite, float towerX, float towerY) {
        sprite = new SpritePlus(waveSprite);
        sprite.setSize(0f);
        sprite.setOriginCenter();
        sprite.setOriginBasedPosition(towerX, towerY);
        sprite.setColor(LIFE_WAVE_COLOR);

        this.towerX = towerX;
        this.towerY = towerY;
    }

    @Override
    public void draw(SpriteBatch spriteBatch) {
        sprite.draw(spriteBatch);
    }

    @Override
    public void drawDebug(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {
    }

    public float getSize() {
        return sprite.getWidth();
    }

    public void setSize(float size) {
        sprite.setSize(size);
        sprite.setOriginCenter();
        sprite.setOriginBasedPosition(towerX, towerY);
    }
}