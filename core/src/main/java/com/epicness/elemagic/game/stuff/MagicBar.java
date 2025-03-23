package com.epicness.elemagic.game.stuff;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.fundamentals.stuff.SpritePlus;

public class MagicBar {

    private final SnapshotArray<SpritePlus> portions;

    public MagicBar() {
        portions = new SnapshotArray<>();
    }

    public void draw(SpriteBatch spriteBatch) {
        for (int i = 0; i < portions.size; i++) {
            portions.get(i).draw(spriteBatch);
        }
    }

    public SnapshotArray<SpritePlus> getPortions() {
        return portions;
    }
}