package com.epicness.elemagic.game;

import com.epicness.elemagic.game.logic.GameLogic;
import com.epicness.elemagic.game.stuff.GameStuff;
import com.epicness.fundamentals.initializer.Initializer;

public class GameInitializer extends Initializer<GameAssets, GameLogic, GameRenderer, GameStuff> {

    public GameInitializer() {
        super(new GameAssets(), new GameLogic(), new GameRenderer(), new GameStuff());
    }
}