package com.epicness.elemagic.game.constants;

import static com.badlogic.gdx.graphics.Color.BLUE;
import static com.badlogic.gdx.graphics.Color.GREEN;
import static com.badlogic.gdx.graphics.Color.RED;

import com.badlogic.gdx.graphics.Color;

public enum Element {

    FIRE(RED, 5), WATER(BLUE, 3), LIFE(GREEN, 10);

    public final Color color;
    public final int cost;

    Element(Color color, int cost) {
        this.color = color;
        this.cost = cost;
    }
}