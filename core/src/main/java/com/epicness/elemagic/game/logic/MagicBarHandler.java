package com.epicness.elemagic.game.logic;

import static com.badlogic.gdx.graphics.Color.SKY;
import static com.epicness.elemagic.game.constants.GameConstants.INITIAL_MAGIC;
import static com.epicness.elemagic.game.constants.GameConstants.MAGIC_PORTION_SIZE;
import static com.epicness.elemagic.game.constants.GameConstants.MAGIC_REPLENISH_RATE;
import static com.epicness.elemagic.game.constants.GameConstants.MAX_MAGIC;

import com.epicness.elemagic.game.stuff.MagicBar;
import com.epicness.fundamentals.stuff.SpritePlus;
import com.epicness.fundamentals.stuff.Text;

public class MagicBarHandler extends GameLogicHandler {

    private MagicBar magicBar;
    private Text manaText;

    private SpritePlus currentPortion;
    private float time;

    @Override
    protected void init() {
        magicBar = stuff.getMagicBar();
        manaText = stuff.getManaText();
        for (int i = 0; i < INITIAL_MAGIC; i++) {
            addMagic();
        }
    }

    @Override
    protected void update(float delta) {
        time += delta;
        if (time >= MAGIC_REPLENISH_RATE) {
            addMagic();
            time = 0f;
        }
    }

    private void addMagic() {
        if (magicBar.getPortions().size == MAX_MAGIC) return;

        SpritePlus portion = new SpritePlus(sharedAssets.getSquare32());
        portion.setSize(MAGIC_PORTION_SIZE);
        portion.setColor(SKY);
        if (currentPortion != null) portion.setX(currentPortion.getEndX());
        magicBar.getPortions().add(portion);
        currentPortion = magicBar.getPortions().get(magicBar.getPortions().size - 1);

        manaText.setText("Mana: " + magicBar.getPortions().size);
    }

    public int getMagic() {
        return magicBar.getPortions().size;
    }

    public void removeMagic(int amount) {
        int portions = magicBar.getPortions().size;
        magicBar.getPortions().removeRange(portions - amount, portions - 1);
        portions = magicBar.getPortions().size;
        if (portions == 0) {
            currentPortion = null;
        } else {
            currentPortion = magicBar.getPortions().get(portions - 1);
        }
        manaText.setText("Mana: " + portions);
    }
}