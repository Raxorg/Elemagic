package com.epicness.elemagic.game.logic.enemy;

import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.elemagic.game.logic.GameLogicHandler;
import com.epicness.elemagic.game.stuff.Enemy;

public class EnemyMover extends GameLogicHandler {

    private SnapshotArray<Enemy> enemies;

    @Override
    protected void init() {
        enemies = stuff.getEnemies();
    }

    @Override
    protected void update(float delta) {
        for (int i = 0; i < enemies.size; i++) {
            moveEnemy(enemies.get(i), delta);
        }
    }

    private void moveEnemy(Enemy enemy, float delta) {
        enemy.translate(enemy.direction.cpy().scl(100f * delta));
    }
}