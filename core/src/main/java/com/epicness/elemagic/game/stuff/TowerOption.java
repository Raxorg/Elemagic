package com.epicness.elemagic.game.stuff;

import static com.badlogic.gdx.graphics.Color.BLACK;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.fundamentals.rendering.ShapeDrawerPlus;
import com.epicness.fundamentals.stuff.SpritedText;
import com.epicness.fundamentals.stuff.interfaces.Buttonable;
import com.epicness.fundamentals.stuff.interfaces.SpriteBatchDrawable;

public class TowerOption implements Buttonable, SpriteBatchDrawable {

    private final SpritedText spritedText;
    private final Color brightColor;

    public TowerOption(Sprite optionSprite, BitmapFont font, Color color, String text) {
        spritedText = new SpritedText(optionSprite, font);
        spritedText.setBackgroundColor(color.cpy().lerp(BLACK, 0.7f));
        spritedText.setText(text);
        spritedText.setSize(150f, 75f);
        spritedText.setFontScale(3f);
        brightColor = color;
    }

    @Override
    public boolean contains(float x, float y) {
        return spritedText.contains(x, y);
    }

    @Override
    public void draw(SpriteBatch spriteBatch) {
        spritedText.draw(spriteBatch);
    }

    @Override
    public void drawDebug(SpriteBatch spriteBatch, ShapeDrawerPlus shapeDrawer) {

    }

    public void setPosition(float x, float y) {
        spritedText.setPosition(x, y);
    }

    public void useBrightColor() {
        spritedText.setBackgroundColor(brightColor);
    }

    public void useDarkColor() {
        spritedText.setBackgroundColor(brightColor.cpy().lerp(BLACK, 0.7f));
    }
}