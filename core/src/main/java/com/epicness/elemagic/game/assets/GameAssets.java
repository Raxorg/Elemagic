package com.epicness.elemagic.game.assets;

import static com.epicness.elemagic.game.assets.GameAssetPaths.*;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.epicness.fundamentals.assets.Assets;

public class GameAssets extends Assets {
    private Sprite stickerQR;

    public GameAssets() {
        super(ASSETS);
    }

    @Override
    public void initializeAssets() {
        stickerQR = get(STICKERQR_SPRITE);
    }

    public Sprite getStickerQR() {
        return stickerQR;
    }
}