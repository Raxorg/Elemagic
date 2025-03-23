package com.epicness.elemagic.game.logic.magictowers;

import static com.epicness.elemagic.game.constants.GameConstants.TOWER_SIZE;

import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.elemagic.game.constants.Element;
import com.epicness.elemagic.game.logic.GameLogicHandler;
import com.epicness.elemagic.game.logic.MagicBarHandler;
import com.epicness.elemagic.game.logic.MagicOptionHandler;
import com.epicness.elemagic.game.stuff.MagicTower;
import com.epicness.fundamentals.stuff.SpritePlus;

public class TowerSpawner extends GameLogicHandler {

    private SnapshotArray<MagicTower> towers;
    private SpritePlus battlefield;
    private SpritePlus base;

    @Override
    protected void init() {
        towers = stuff.getTowers();
        battlefield = stuff.getBattlefield();
        base = stuff.getBase();
    }

    @Override
    public void touchDown(float x, float y, int button) {
        if (!battlefield.contains(x, y)) return;

        spawnTower(x - TOWER_SIZE / 2f, y - TOWER_SIZE / 2f);
    }

    private void spawnTower(float x, float y) {
        Element element = get(MagicOptionHandler.class).getElement();
        if (element == null) return;

        if (element.cost > get(MagicBarHandler.class).getMagic()) return;

        MagicTower tower = new MagicTower(sharedAssets.getSquare32(), element.color, element, x, y);
        for (int i = 0; i < towers.size; i++) {
            if (towers.get(i).overlaps(tower)) return;
        }

        if (tower.overlaps(base.getBoundingRectangle())) return;

        get(MagicBarHandler.class).removeMagic(element.cost);
        towers.add(tower);
    }
}