package com.epicness.elemagic.game.stuff;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;
import com.epicness.elemagic.game.constants.Element;
import com.epicness.fundamentals.rendering.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.shapes.bidimensional.CirclePlus;
import com.epicness.fundamentals.stuff.shapes.bidimensional.Drawable2D;

public class MagicBall implements Drawable2D {

    public final CirclePlus circle;
    public final Element element;
    public final Vector2 direction;

    public MagicBall(Element element, float x, float y, Vector2 direction) {
        circle = new CirclePlus(5f, element.color);
        circle.setCenterBasedPosition(x, y);
        this.element = element;
        this.direction = direction;
    }

    @Override
    public void draw(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {
        circle.draw(shapeDrawer);
    }

    @Override
    public void drawDebug(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {
    }

    public void translate(Vector2 amount) {
        circle.translate(amount);
    }

    public Vector2 getCenter() {
        return circle.getCenter();
    }
}