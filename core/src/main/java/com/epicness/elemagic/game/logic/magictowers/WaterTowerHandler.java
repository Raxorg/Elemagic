package com.epicness.elemagic.game.logic.magictowers;

import static com.epicness.elemagic.game.constants.Element.WATER;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.elemagic.game.logic.GameLogicHandler;
import com.epicness.elemagic.game.stuff.MagicBall;
import com.epicness.elemagic.game.stuff.MagicTower;

public class WaterTowerHandler extends GameLogicHandler {

    private SnapshotArray<MagicBall> balls;

    @Override
    protected void init() {
        balls = stuff.getBalls();
    }

    public void spawnWaterBalls(MagicTower tower) {
        for (int i = 0; i < 9; i++) {
            spawnWaterBall(tower.getCenterX(), tower.getCenterY());
        }
    }

    private void spawnWaterBall(float x, float y) {
        float angle = MathUtils.random(360f);
        x += 60f * MathUtils.cosDeg(angle);
        y += 60f * MathUtils.sinDeg(angle);
        MagicBall ball = new MagicBall(WATER, x, y, null);
        balls.add(ball);
    }
}