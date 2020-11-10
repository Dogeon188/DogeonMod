package me.dogeon.dogeon_mod;

import me.dogeon.dogeon_mod.block.DogeonBlocks;
import me.dogeon.dogeon_mod.item.DogeonItems;
import net.fabricmc.api.ModInitializer;

public class DogeonMod implements ModInitializer {
    public static final String MOD_ID = "dogeon_mod";

    public void onInitialize() {
        try {
            DogeonBlocks.registerBlocks();
            DogeonItems.registerItems();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
