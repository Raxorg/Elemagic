package com.epicness.elemagic.game.constants;

import static com.epicness.fundamentals.constants.SharedConstants.VIEWPORT_HEIGHT;

public class GameConstants {

    public static final int MAX_MAGIC = 19;
    public static final float MAGIC_PORTION_SIZE = 50f;

    public static final float BATTLEFIELD_SIZE = VIEWPORT_HEIGHT - MAGIC_PORTION_SIZE;
    public static final float BATTLEFIELD_Y = MAGIC_PORTION_SIZE;

    public static final float TOWER_SIZE = 25f;

    public static final float BASE_Y = BATTLEFIELD_Y + BATTLEFIELD_SIZE / 2f;
}