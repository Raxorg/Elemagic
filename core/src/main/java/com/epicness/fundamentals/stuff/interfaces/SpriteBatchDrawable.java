package com.epicness.fundamentals.stuff.interfaces;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.fundamentals.rendering.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.shapes.bidimensional.Drawable2D;

public interface SpriteBatchDrawable extends Drawable2D {

    @Override
    default void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {
        draw(spriteBatch);
    }

    void draw(SpriteBatch spriteBatch);
}