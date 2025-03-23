package com.epicness.elemagic;

import com.badlogic.gdx.Game;
import com.epicness.elemagic.game.GameInitializer;
import com.epicness.elemagic.game.assets.GameAssets;
import com.epicness.fundamentals.SharedResources;

public class ElemagicGame extends Game {

    @Override
    public void create() {
        GameAssets assets = new GameAssets();
        assets.queueAssetLoading();
        assets.finishLoading();
        assets.initAssets();
        new GameInitializer(assets).initialize(new SharedResources());
    }
}