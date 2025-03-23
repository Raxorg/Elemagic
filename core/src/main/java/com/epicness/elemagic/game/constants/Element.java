package com.epicness.elemagic.game.constants;

import static com.badlogic.gdx.graphics.Color.BLUE;
import static com.badlogic.gdx.graphics.Color.GREEN;
import static com.badlogic.gdx.graphics.Color.RED;
import static com.epicness.elemagic.game.constants.GameConstants.FIRE_COST;
import static com.epicness.elemagic.game.constants.GameConstants.LIFE_COST;
import static com.epicness.elemagic.game.constants.GameConstants.WATER_COST;

import com.badlogic.gdx.graphics.Color;

public enum Element {

    FIRE(RED, FIRE_COST), WATER(BLUE, WATER_COST), LIFE(GREEN, LIFE_COST);

    public final Color color;
    public final int cost;

    Element(Color color, int cost) {
        this.color = color;
        this.cost = cost;
    }
}