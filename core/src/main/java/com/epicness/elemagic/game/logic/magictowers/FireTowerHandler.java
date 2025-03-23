package com.epicness.elemagic.game.logic.magictowers;

import static com.epicness.elemagic.game.constants.Element.FIRE;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
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

    public void spawnFireBalls(MagicTower tower) {
        for (int i = 0; i < 5; i++) {
            spawnFireBall(tower.getCenterX(), tower.getCenterY());
        }
    }

    private void spawnFireBall(float x, float y) {
        float angle = MathUtils.random(360f);
        MagicBall ball = new MagicBall(sharedAssets.getDot(), FIRE, x, y, new Vector2(1f, 0f).setAngleDeg(angle));
        balls.add(ball);
    }
}