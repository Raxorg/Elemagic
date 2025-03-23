package com.epicness.elemagic.game.constants;

import static com.epicness.fundamentals.constants.SharedConstants.VIEWPORT_HEIGHT;

import com.badlogic.gdx.graphics.Color;

public class GameConstants {

    public static final int MAX_MAGIC = 19;
    public static final float MAGIC_PORTION_SIZE = 50f;

    public static final float BATTLEFIELD_SIZE = VIEWPORT_HEIGHT - MAGIC_PORTION_SIZE;
    public static final float BATTLEFIELD_Y = MAGIC_PORTION_SIZE;

    public static final float TOWER_SIZE = 25f;
    public static final int FIRE_COST = 5;
    public static final int WATER_COST = 3;
    public static final int LIFE_COST = 10;

    public static final int INITIAL_MAGIC = 19;

    public static final Color LIFE_WAVE_COLOR = new Color(0f, 1f, 0f, 0.3f);

    public static final float BASE_Y = BATTLEFIELD_Y + BATTLEFIELD_SIZE / 2f;
}