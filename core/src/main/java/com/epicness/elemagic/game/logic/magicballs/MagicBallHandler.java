package com.epicness.elemagic.game.logic.magicballs;

import static com.epicness.fundamentals.utils.ArrayUtils.loopArray;

import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.elemagic.game.logic.GameLogicHandler;
import com.epicness.elemagic.game.stuff.MagicBall;
import com.epicness.fundamentals.stuff.SpritePlus;

public class MagicBallHandler extends GameLogicHandler {

    private SnapshotArray<MagicBall> balls;
    private SpritePlus battlefield;

    @Override
    protected void init() {
        balls = stuff.getBalls();
        battlefield = stuff.getBattlefield();
    }

    @Override
    protected void update(float delta) {
        loopArray(balls, ball -> {
            checkBounds(ball);
            switch (ball.element) {
                case FIRE:
                    get(FireBallHandler.class).moveBall(ball, delta);
                    break;
                case WATER:
                    get(WaterBallHandler.class).checkCollisions(ball);
                    break;
            }
        });
    }

    private void checkBounds(MagicBall ball) {
        if (!battlefield.contains(ball.getCenter())) {
            balls.removeValue(ball, true);
        }
    }
}