package com.epicness.elemagic.game.logic.magicballs;

import static com.epicness.fundamentals.utils.ArrayUtils.loopArray;

import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.elemagic.game.logic.GameLogicHandler;
import com.epicness.elemagic.game.logic.TextHandler;
import com.epicness.elemagic.game.stuff.Enemy;
import com.epicness.elemagic.game.stuff.MagicBall;
import com.epicness.fundamentals.utils.CollisionUtils;

public class WaterBallHandler extends GameLogicHandler {

    private SnapshotArray<MagicBall> balls;
    private SnapshotArray<Enemy> enemies;

    @Override
    protected void init() {
        balls = stuff.getBalls();
        enemies = stuff.getEnemies();
    }

    public void checkCollisions(MagicBall ball) {
        loopArray(enemies, enemy -> {
            if (CollisionUtils.overlaps(ball.circle, enemy.circle)) {
                balls.removeValue(ball, true);
                enemy.health--;
                if (enemy.health <= 0) {
                    enemies.removeValue(enemy, true);
                    get(TextHandler.class).addScore(10);
                }
            }
        });
    }
}