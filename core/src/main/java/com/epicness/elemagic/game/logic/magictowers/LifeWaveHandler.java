package com.epicness.elemagic.game.logic.magictowers;

import com.badlogic.gdx.math.Vector2;
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
            checkCollisions(waves.get(i));
            expandWave(waves.get(i), delta);
        }
        waves.end();
    }

    private void expandWave(LifeWave wave, float delta) {
        wave.setSize(wave.getSize() + 400f * delta);
        if (wave.getSize() >= 200f) {
            waves.removeValue(wave, true);
        }
    }

    private void checkCollisions(LifeWave wave) {
        Vector2 towerPosition = new Vector2();
        Vector2 waveOrigin = new Vector2(wave.towerX, wave.towerY);
        for (int i = 0; i < towers.size; i++) {
            MagicTower tower = towers.get(i);
            towerPosition.set(tower.getCenterX(), tower.getCenterY());
            if (towerPosition.dst(waveOrigin) < wave.getSize()) {
                activateTower(tower);
            }
        }
    }

    private void activateTower(MagicTower tower) {
        if (tower.activationCooldown > 0) return;
        tower.activationCooldown = 1f;
    }
}