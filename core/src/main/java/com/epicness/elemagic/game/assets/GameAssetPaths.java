package com.epicness.elemagic.game.assets;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.graphics.g2d.Sprite;
import java.util.ArrayList;
import java.util.List;

public class GameAssetPaths {
    static final List<AssetDescriptor<?>> ASSETS;

    public static final AssetDescriptor<Sprite> STICKERQR_SPRITE;

    static {
        ASSETS = new ArrayList<>();
        ASSETS.add(STICKERQR_SPRITE = new AssetDescriptor<>("elemagic/game/images/stickerQR.png", Sprite.class));
    }
}