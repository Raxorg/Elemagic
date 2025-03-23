package com.epicness.elemagic.game.logic.magicballs;

import com.epicness.elemagic.game.logic.GameLogicHandler;
import com.epicness.elemagic.game.stuff.MagicBall;

public class FireBallHandler extends GameLogicHandler {

    @Override
    protected void init() {
    }

    public void moveBall(MagicBall ball, float delta) {
        ball.translate(ball.direction.cpy().scl(200f * delta));
    }
}