package com.epicness.elemagic.game.logic;

import com.epicness.elemagic.game.logic.magictowers.FireTowerHandler;
import com.epicness.elemagic.game.logic.magictowers.LifeTowerHandler;
import com.epicness.elemagic.game.logic.magictowers.MagicTowerHandler;
import com.epicness.elemagic.game.logic.magictowers.TowerSpawner;
import com.epicness.elemagic.game.logic.magictowers.WaterTowerHandler;
import com.epicness.fundamentals.logic.Logic;

public class GameLogic extends Logic {

    private final MagicTowerHandler magicTowerHandler;
    private final MagicBarHandler magicBarHandler;

    public GameLogic() {
        registerHandler(magicTowerHandler = new MagicTowerHandler());
        registerHandler(new FireTowerHandler());
        registerHandler(new LifeTowerHandler());
        registerHandler(new WaterTowerHandler());

        registerHandler(magicBarHandler = new MagicBarHandler());
        registerHandler(new MagicOptionHandler());
        registerHandler(new TowerSpawner());
    }

    @Override
    public void update() {
        magicTowerHandler.update();
        magicBarHandler.update();
    }

    @Override
    public void resize(int width, int height) {

    }
}