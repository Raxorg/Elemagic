package com.epicness.elemagic.game.logic.magictowers;

import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.elemagic.game.logic.GameLogicHandler;
import com.epicness.elemagic.game.stuff.MagicTower;

public class MagicTowerHandler extends GameLogicHandler {

    private SnapshotArray<MagicTower> towers;

    @Override
    protected void init() {
        towers = stuff.getTowers();
    }

    @Override
    protected void update(float delta) {
        for (int i = 0; i < towers.size; i++) {
            switch (towers.get(i).getElement()) {
                case FIRE:
                    get(FireTowerHandler.class).updateCooldown(towers.get(i), delta);
                    break;
                case WATER:
                    get(WaterTowerHandler.class).updateCooldown(towers.get(i), delta);
                    break;
                case LIFE:
                    get(LifeTowerHandler.class).updateCooldown(towers.get(i), delta);
                    break;
            }
        }
    }
}