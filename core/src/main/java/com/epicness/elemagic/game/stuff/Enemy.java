package com.epicness.elemagic.game.stuff;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.epicness.fundamentals.rendering.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.shapes.bidimensional.CirclePlus;
import com.epicness.fundamentals.stuff.shapes.bidimensional.Drawable2D;

public class Enemy implements Drawable2D {

    private final CirclePlus circle;
    public final Vector2 direction;
    public int health;

    public Enemy(Vector2 position, Vector2 direction, int health) {
        circle = new CirclePlus(10f);
        circle.setCenterBasedPosition(position);
        this.direction = direction;
        this.health = health;
    }

    @Override
    public void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {
        circle.draw(shapeDrawer);
    }

    @Override
    public void drawDebug(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {
    }

    public void setColor(Color color) {
        circle.setColor(color);
    }
}