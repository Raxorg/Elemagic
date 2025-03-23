package com.epicness.elemagic.game.stuff;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.elemagic.game.constants.Element;
import com.epicness.fundamentals.rendering.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.SpritePlus;
import com.epicness.fundamentals.stuff.interfaces.SpriteBatchDrawable;

public class MagicBall implements SpriteBatchDrawable {

    private final SpritePlus sprite;
    public final Element element;

    public MagicBall(Sprite ballSprite, Element element, float x, float y) {
        sprite = new SpritePlus(ballSprite);
        sprite.setColor(element.color);
        sprite.setSize(10f);
        sprite.setOriginCenter();
        sprite.setOriginBasedPosition(x, y);
        this.element = element;
    }

    @Override
    public void draw(SpriteBatch spriteBatch) {
        sprite.draw(spriteBatch);
    }

    @Override
    public void drawDebug(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {
    }
}