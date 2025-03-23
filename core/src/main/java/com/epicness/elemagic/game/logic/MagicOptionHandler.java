package com.epicness.elemagic.game.logic;

import static com.epicness.elemagic.game.constants.Element.FIRE;
import static com.epicness.elemagic.game.constants.Element.LIFE;
import static com.epicness.elemagic.game.constants.Element.WATER;

import com.epicness.elemagic.game.constants.Element;
import com.epicness.elemagic.game.stuff.TowerOption;

public class MagicOptionHandler extends GameLogicHandler {

    private TowerOption fireOption, waterOption, lifeOption;
    private Element element;

    @Override
    protected void init() {
        fireOption = stuff.getFireOption();
        waterOption = stuff.getWaterOption();
        lifeOption = stuff.getLifeOption();
    }

    @Override
    public void touchDown(float x, float y, int button) {
        if (fireOption.contains(x, y)) {
            deselect();
            fireOption.useBrightColor();
            element = FIRE;
        }
        if (waterOption.contains(x, y)) {
            deselect();
            waterOption.useBrightColor();
            element = WATER;
        }
        if (lifeOption.contains(x, y)) {
            deselect();
            lifeOption.useBrightColor();
            element = LIFE;
        }
    }

    private void deselect() {
        fireOption.useDarkColor();
        waterOption.useDarkColor();
        lifeOption.useDarkColor();
    }

    public Element getElement() {
        return element;
    }
}