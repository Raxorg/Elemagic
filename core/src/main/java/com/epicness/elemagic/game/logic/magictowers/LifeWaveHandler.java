package com.epicness.elemagic.game.logic.magictowers;

import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.elemagic.game.logic.GameLogicHandler;
import com.epicness.elemagic.game.stuff.LifeWave;
import com.epicness.elemagic.game.stuff.MagicTower;

public class LifeWaveHandler extends GameLogicHandler {

    private SnapshotArray<LifeWave> waves;
    private SnapshotArray<MagicTower> towers;

    @Override
    protected void init() {
        waves = stuff.getLifeWaves();
        towers = stuff.getTowers();
    }

    @Override
    protected void update(float delta) {
        waves.begin();
        for (int i = 0; i < waves.size; i++) {
            expandWave(waves.get(i), delta);
            checkCollisions(waves.get(i));
        }
        waves.end();
    }

    private void expandWave(LifeWave wave, float delta) {
        wave.setSize(wave.getSize() + 500f * delta);
        if (wave.getSize() >= 200f) {
            waves.removeValue(wave, true);
        }
    }

    private void checkCollisions(LifeWave wave) {

    }
}