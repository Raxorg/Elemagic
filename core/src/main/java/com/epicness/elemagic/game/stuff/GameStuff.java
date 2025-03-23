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

import com.badlogic.gdx.utils.SnapshotArray;
import com.epicness.elemagic.game.GameAssets;
import com.epicness.fundamentals.stuff.SpritePlus;
import com.epicness.fundamentals.stuff.Stuff;

public class GameStuff extends Stuff<GameAssets> {

    private SpritePlus battlefield;
    private SnapshotArray<MagicTower> towers;
    private SnapshotArray<LifeWave> lifeWaves;
    private SnapshotArray<Enemy> enemies;
    private MagicBar magicBar;
    private TowerOption fireOption, waterOption, lifeOption;
    private SnapshotArray<MagicBall> balls;
    private SpritePlus base;

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
}