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

    @Override
    protected void init() {
        towers = stuff.getTowers();
        battlefield = stuff.getBattlefield();
    }

    @Override
    public void touchDown(float x, float y, int button) {
        if (!battlefield.contains(x, y)) return;

        Element element = get(MagicOptionHandler.class).getElement();
        if (element == null) return;

        if (element.cost > get(MagicBarHandler.class).getMagic()) return;

        get(MagicBarHandler.class).removeMagic(element.cost);
        spawnTower(element, x - TOWER_SIZE / 2f, y - TOWER_SIZE / 2f);
    }

    private void spawnTower(Element element, float x, float y) {
        MagicTower tower = new MagicTower(sharedAssets.getSquare32(), element.color, element, x, y);
        towers.add(tower);
    }
}