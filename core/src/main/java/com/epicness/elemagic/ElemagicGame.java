package com.epicness.elemagic;

import com.badlogic.gdx.Game;
import com.epicness.elemagic.game.GameInitializer;
import com.epicness.fundamentals.SharedResources;

public class ElemagicGame extends Game {

    @Override
    public void create() {
        new GameInitializer().initialize(new SharedResources());
    }
}