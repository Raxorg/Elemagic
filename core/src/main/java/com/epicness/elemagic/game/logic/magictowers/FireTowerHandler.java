package com.epicness.elemagic.game.logic.magictowers;

import static com.epicness.elemagic.game.constants.Element.FIRE;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.elemagic.game.logic.GameLogicHandler;
import com.epicness.elemagic.game.stuff.MagicBall;
import com.epicness.elemagic.game.stuff.MagicTower;

public class FireTowerHandler extends GameLogicHandler {

    private SnapshotArray<MagicBall> balls;

    @Override
    protected void init() {
        balls = stuff.getBalls();
    }

    public void updateCooldown(MagicTower tower, float delta) {
        tower.spawnCooldown -= delta;
        if (tower.spawnCooldown <= 0f) {
            spawnFireBall(tower);
        }
    }

    public void spawnFireBall(MagicTower tower) {
        float x = tower.getCenterX();
        float y = tower.getCenterY();
        float angle = MathUtils.random(360f);
        x += 30f * MathUtils.cosDeg(angle);
        y += 30f * MathUtils.sinDeg(angle);
        MagicBall ball = new MagicBall(sharedAssets.getDot(), FIRE, x, y);
        balls.add(ball);
        tower.spawnCooldown = 5f;
    }
}