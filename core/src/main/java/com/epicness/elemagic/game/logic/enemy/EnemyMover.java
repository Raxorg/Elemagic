package com.epicness.elemagic.game.logic.enemy;

import static com.epicness.fundamentals.utils.ArrayUtils.loopArray;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.elemagic.game.logic.BaseHandler;
import com.epicness.elemagic.game.logic.GameLogicHandler;
import com.epicness.elemagic.game.stuff.Enemy;
import com.epicness.fundamentals.stuff.SpritePlus;

public class EnemyMover extends GameLogicHandler {

    private SnapshotArray<Enemy> enemies;
    private SpritePlus base;

    @Override
    protected void init() {
        enemies = stuff.getEnemies();
        base = stuff.getBase();
    }

    @Override
    protected void update(float delta) {
        loopArray(enemies, enemy -> {
            moveEnemy(enemy, delta);
            checkArrivalToBase(enemy);
        });
    }

    private void moveEnemy(Enemy enemy, float delta) {
        if (enemy.circle.getCenter().dst(base.getCenter()) < 28f) {
            enemy.translate(enemy.direction.cpy().setToRandomDirection());
        } else {
            enemy.translate(enemy.direction.cpy().scl(80f * delta));
        }

    }

    private void checkArrivalToBase(Enemy enemy) {
        if (enemy.circle.getCenter().dst(base.getCenter()) < 19f) {
            enemies.removeValue(enemy, true);
            get(BaseHandler.class).loseLife();
        }
    }
}