package com.epicness.elemagic.game.logic.enemy;

import static com.epicness.elemagic.game.constants.GameConstants.BATTLEFIELD_SIZE;
import static com.epicness.elemagic.game.constants.GameConstants.BATTLEFIELD_Y;
import static com.epicness.elemagic.game.constants.GameConstants.ENEMY_SPAWN_RATE;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.elemagic.game.logic.GameLogicHandler;
import com.epicness.elemagic.game.stuff.Enemy;
import com.epicness.fundamentals.stuff.SpritePlus;
import com.epicness.fundamentals.utils.AngleUtils;

public class EnemySpawner extends GameLogicHandler {

    private SnapshotArray<Enemy> enemies;
    private SpritePlus battlefield;

    private int spawnedEnemies;
    private float time;

    @Override
    protected void init() {
        enemies = stuff.getEnemies();
        battlefield = stuff.getBattlefield();
    }

    @Override
    protected void update(float delta) {
        time += delta;
        if (time >= ENEMY_SPAWN_RATE) {
            spawnEnemy();
            spawnedEnemies++;
            time = 0f;
        }
    }

    private void spawnEnemy() {
        int health = 1 + spawnedEnemies / 8;

        float angle = MathUtils.random(360f);
        Vector2 enemyPosition = new Vector2(1f, 0f);
        enemyPosition.setAngleDeg(angle);
        enemyPosition.setLength(BATTLEFIELD_SIZE * 0.7f);
        enemyPosition.x += BATTLEFIELD_SIZE * 0.5f;
        enemyPosition.y += BATTLEFIELD_Y + BATTLEFIELD_SIZE * 0.5f;

        float directionAngle = AngleUtils.degreesBetweenPoints(battlefield.getCenter(), enemyPosition);
        Vector2 direction = new Vector2(1f, 0f).setAngleDeg(directionAngle);

        Enemy enemy = new Enemy(enemyPosition, direction, health);
        enemies.add(enemy);
    }
}