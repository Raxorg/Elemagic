package com.epicness.elemagic.game;

import static com.epicness.fundamentals.constants.ColorConstants.LIBGDX_MATTE;

import com.badlogic.gdx.utils.ScreenUtils;
import com.epicness.elemagic.game.stuff.GameStuff;
import com.epicness.fundamentals.rendering.Renderer;

public class GameRenderer extends Renderer<GameStuff> {

    @Override
    public void render() {
        ScreenUtils.clear(LIBGDX_MATTE);

        useStaticCamera();
        spriteBatch.begin();
        stuff.getBattlefield().draw(spriteBatch);
        drawArray(stuff.getTowers());
        drawArray(stuff.getLifeWaves());
        drawArray(stuff.getEnemies());
        stuff.getMagicBar().draw(spriteBatch);
        stuff.getFireOption().draw(spriteBatch);
        stuff.getWaterOption().draw(spriteBatch);
        stuff.getLifeOption().draw(spriteBatch);
        stuff.getBase().draw(spriteBatch);
        stuff.getEasterEgg().draw(spriteBatch);
        drawArray(stuff.getBalls());
        spriteBatch.end();
    }
}