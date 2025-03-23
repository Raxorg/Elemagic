package com.epicness.elemagic.game.stuff;

import static com.badlogic.gdx.graphics.Color.BLACK;
import static com.epicness.elemagic.game.constants.GameConstants.TOWER_SIZE;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.epicness.elemagic.game.constants.Element;
import com.epicness.fundamentals.rendering.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.SpritePlus;
import com.epicness.fundamentals.stuff.interfaces.SpriteBatchDrawable;

public class MagicTower implements SpriteBatchDrawable {

    private final SpritePlus sprite;
    private final Element element;
    public float spellCooldown, activationCooldown;
    private final Color brightColor, darkColor;

    public MagicTower(Sprite towerSprite, Color color, Element element, float x, float y) {
        sprite = new SpritePlus(towerSprite);
        sprite.setColor(color);
        sprite.setSize(TOWER_SIZE);
        sprite.setPosition(x, y);

        brightColor = color;
        darkColor = color.cpy().lerp(BLACK, 0.7f);

        this.element = element;
    }

    public boolean overlaps(MagicTower other) {
        return sprite.getBoundingRectangle().overlaps(other.sprite.getBoundingRectangle());
    }

    public boolean overlaps(Rectangle rectangle) {
        return sprite.getBoundingRectangle().overlaps(rectangle);
    }

    @Override
    public void draw(SpriteBatch spriteBatch) {
        sprite.draw(spriteBatch);
    }

    @Override
    public void drawDebug(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {

    }

    public float getCenterX() {
        return sprite.getCenterX();
    }

    public float getCenterY() {
        return sprite.getCenterY();
    }

    public void useBrightColor() {
        sprite.setColor(brightColor);
    }

    public void useDarkColor() {
        sprite.setColor(darkColor);
    }

    public Element getElement() {
        return element;
    }
}