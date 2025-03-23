package com.epicness.elemagic.game.logic.magictowers;

import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.elemagic.game.logic.GameLogicHandler;
import com.epicness.elemagic.game.stuff.LifeWave;
import com.epicness.elemagic.game.stuff.MagicTower;

public class LifeTowerHandler extends GameLogicHandler {

    private SnapshotArray<LifeWave> lifeWaves;

    @Override
    protected void init() {
        lifeWaves = stuff.getLifeWaves();
    }

    public void updateCooldown(MagicTower tower, float delta) {
        tower.spawnCooldown -= delta;
        if (tower.spawnCooldown <= 0f) {
            spawnLifeWave(tower);
            tower.spawnCooldown = 2.5f;
        }
    }

    private void spawnLifeWave(MagicTower tower) {
        LifeWave wave = new LifeWave(sharedAssets.getCircle(), tower.getCenterX(), tower.getCenterY());
        lifeWaves.add(wave);
    }
}