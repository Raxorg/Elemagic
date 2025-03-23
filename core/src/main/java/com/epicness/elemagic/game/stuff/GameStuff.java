package com.epicness.elemagic.game.stuff;

import static com.badlogic.gdx.graphics.Color.BLUE;
import static com.badlogic.gdx.graphics.Color.GREEN;
import static com.badlogic.gdx.graphics.Color.RED;
import static com.badlogic.gdx.graphics.Color.YELLOW;
import static com.epicness.elemagic.game.constants.GameConstants.BASE_X;
import static com.epicness.elemagic.game.constants.GameConstants.BASE_Y;
import static com.epicness.elemagic.game.constants.GameConstants.BATTLEFIELD_SIZE;
import static com.epicness.elemagic.game.constants.GameConstants.BATTLEFIELD_Y;
import static com.epicness.fundamentals.constants.ColorConstants.LIBGDX_MATTE;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.elemagic.game.assets.GameAssets;
import com.epicness.fundamentals.stuff.SpritePlus;
import com.epicness.fundamentals.stuff.Stuff;
import com.epicness.fundamentals.stuff.Text;

public class GameStuff extends Stuff<GameAssets> {

    private SpritePlus battlefield;
    private SnapshotArray<MagicTower> towers;
    private SnapshotArray<LifeWave> lifeWaves;
    private SnapshotArray<Enemy> enemies;
    private MagicBar magicBar;
    private TowerOption fireOption, waterOption, lifeOption;
    private SnapshotArray<MagicBall> balls;
    private SpritePlus base;
    private SnapshotArray<SpritePlus> lives;
    private SpritePlus easterEgg;
    private Text score, enemyHealth;

    @Override
    public void initializeStuff() {
        battlefield = new SpritePlus(sharedAssets.getSquare32());
        battlefield.setSize(BATTLEFIELD_SIZE);
        battlefield.setColor(LIBGDX_MATTE);
        battlefield.setY(BATTLEFIELD_Y);

        towers = new SnapshotArray<>();
        lifeWaves = new SnapshotArray<>();
        enemies = new SnapshotArray<>();
        magicBar = new MagicBar();

        fireOption = new TowerOption(sharedAssets.getSquare32(), sharedAssets.getPixelFont(), RED, "Fire");
        fireOption.setPosition(-150f, 700f);

        waterOption = new TowerOption(sharedAssets.getSquare32(), sharedAssets.getPixelFont(), BLUE, "Water");
        waterOption.setPosition(-150f, 600f);

        lifeOption = new TowerOption(sharedAssets.getSquare32(), sharedAssets.getPixelFont(), GREEN, "Life");
        lifeOption.setPosition(-150f, 500f);

        balls = new SnapshotArray<>();

        base = new SpritePlus(sharedAssets.getSquare32());
        base.setColor(YELLOW);
        base.setSize(25f);
        base.setOriginCenter();
        base.setOriginBasedPosition(BASE_X, BASE_Y);

        lives = new SnapshotArray<>();

        easterEgg = new SpritePlus(sharedAssets.getWeirdShape());
        easterEgg.setPosition(BATTLEFIELD_SIZE, BATTLEFIELD_Y);
        easterEgg.setColor(new Color(1f, 1f, 1f, 0.04f));

        score = new Text(sharedAssets.getPixelFont());
        score.setPosition(-300f, 930f);
        score.setText("Score: 0");

        enemyHealth = new Text(sharedAssets.getPixelFont());
        enemyHealth.setPosition(-300f, 860f);
        enemyHealth.setText("Enemy HP: 1");
    }

    public SnapshotArray<MagicTower> getTowers() {
        return towers;
    }

    public SnapshotArray<LifeWave> getLifeWaves() {
        return lifeWaves;
    }

    public SnapshotArray<Enemy> getEnemies() {
        return enemies;
    }

    public MagicBar getMagicBar() {
        return magicBar;
    }

    public TowerOption getFireOption() {
        return fireOption;
    }

    public TowerOption getWaterOption() {
        return waterOption;
    }

    public TowerOption getLifeOption() {
        return lifeOption;
    }

    public SpritePlus getBattlefield() {
        return battlefield;
    }

    public SnapshotArray<MagicBall> getBalls() {
        return balls;
    }

    public SpritePlus getBase() {
        return base;
    }

    public SnapshotArray<SpritePlus> getLives() {
        return lives;
    }

    public SpritePlus getEasterEgg() {
        return easterEgg;
    }

    public Text getScore() {
        return score;
    }

    public Text getEnemyHealth() {
        return enemyHealth;
    }
}