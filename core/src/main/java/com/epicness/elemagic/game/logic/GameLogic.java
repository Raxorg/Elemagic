package com.epicness.elemagic.game.logic;

import com.epicness.elemagic.game.logic.magicballs.FireBallHandler;
import com.epicness.elemagic.game.logic.magicballs.MagicBallHandler;
import com.epicness.elemagic.game.logic.magictowers.FireTowerHandler;
import com.epicness.elemagic.game.logic.magictowers.LifeTowerHandler;
import com.epicness.elemagic.game.logic.magictowers.LifeWaveHandler;
import com.epicness.elemagic.game.logic.magictowers.MagicTowerHandler;
import com.epicness.elemagic.game.logic.magictowers.TowerSpawner;
import com.epicness.elemagic.game.logic.magictowers.WaterTowerHandler;
import com.epicness.fundamentals.logic.Logic;

public class GameLogic extends Logic {

    private final MagicBallHandler magicBallHandler;

    private final MagicTowerHandler magicTowerHandler;
    private final LifeWaveHandler lifeWaveHandler;

    private final MagicBarHandler magicBarHandler;

    public GameLogic() {
        registerHandler(magicBallHandler = new MagicBallHandler());
        registerHandler(new FireBallHandler());

        registerHandler(magicTowerHandler = new MagicTowerHandler());
        registerHandler(new FireTowerHandler());
        registerHandler(new LifeTowerHandler());
        registerHandler(new WaterTowerHandler());
        registerHandler(lifeWaveHandler = new LifeWaveHandler());

        registerHandler(magicBarHandler = new MagicBarHandler());
        registerHandler(new MagicOptionHandler());
        registerHandler(new TowerSpawner());
    }

    @Override
    public void update() {
        magicBallHandler.update();

        magicTowerHandler.update();
        lifeWaveHandler.update();

        magicBarHandler.update();
    }

    @Override
    public void resize(int width, int height) {

    }
}