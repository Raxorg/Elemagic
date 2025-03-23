package com.epicness.elemagic.game.logic.magicballs;

import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.elemagic.game.constants.Element;
import com.epicness.elemagic.game.logic.GameLogicHandler;
import com.epicness.elemagic.game.stuff.MagicBall;

public class MagicBallHandler extends GameLogicHandler {

    private SnapshotArray<MagicBall> balls;

    @Override
    protected void init() {
        balls = stuff.getBalls();
    }

    @Override
    protected void update(float delta) {
        for (int i = 0; i < balls.size; i++) {
            if (balls.get(i).element == Element.FIRE) {
                get(FireBallHandler.class).moveBall(balls.get(i), delta);
            }
        }
    }
}