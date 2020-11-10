package me.dogeon.dogeon_mod.item;

import me.dogeon.dogeon_mod.DogeonMod;
import me.dogeon.dogeon_mod.block.DogeonBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DogeonItems {
    public static final Item RUST;
    public static final Item SEMI_WEATHERED_IRON_BLOCK;
    public static final Item LIGHTLY_WEATHERED_IRON_BLOCK;
    public static final Item IRON_BLOCK;
    public static final Item WAXED_RUST;
    public static final Item WAXED_SEMI_WEATHERED_IRON_BLOCK;
    public static final Item WAXED_LIGHTLY_WEATHERED_IRON_BLOCK;
    public static final Item WAXED_IRON_BLOCK;

    static {
        RUST = new BlockItem(DogeonBlocks.RUST, new Item.Settings().group(DogeonItemGroup.GENERAL));
        SEMI_WEATHERED_IRON_BLOCK = new BlockItem(DogeonBlocks.SEMI_WEATHERED_IRON_BLOCK,
                new Item.Settings().group(DogeonItemGroup.GENERAL));
        LIGHTLY_WEATHERED_IRON_BLOCK = new BlockItem(DogeonBlocks.LIGHTLY_WEATHERED_IRON_BLOCK,
                new Item.Settings().group(DogeonItemGroup.GENERAL));
        IRON_BLOCK = new BlockItem(DogeonBlocks.IRON_BLOCK, new Item.Settings().group(DogeonItemGroup.GENERAL));
        WAXED_RUST = new BlockItem(DogeonBlocks.WAXED_RUST, new Item.Settings().group(DogeonItemGroup.GENERAL));
        WAXED_SEMI_WEATHERED_IRON_BLOCK = new BlockItem(DogeonBlocks.WAXED_SEMI_WEATHERED_IRON_BLOCK,
                new Item.Settings().group(DogeonItemGroup.GENERAL));
        WAXED_LIGHTLY_WEATHERED_IRON_BLOCK = new BlockItem(DogeonBlocks.WAXED_LIGHTLY_WEATHERED_IRON_BLOCK,
                new Item.Settings().group(DogeonItemGroup.GENERAL));
        WAXED_IRON_BLOCK = new BlockItem(DogeonBlocks.WAXED_IRON_BLOCK,
                new Item.Settings().group(DogeonItemGroup.GENERAL));
    }

    public static void registerItems() {
        register("rust", RUST);
        register("semi_weathered_iron_block", SEMI_WEATHERED_IRON_BLOCK);
        register("lightly_weathered_iron_block", LIGHTLY_WEATHERED_IRON_BLOCK);
        register("iron_block", IRON_BLOCK);
        register("waxed_rust", WAXED_RUST);
        register("waxed_semi_weathered_iron_block", WAXED_SEMI_WEATHERED_IRON_BLOCK);
        register("waxed_lightly_weathered_iron_block", WAXED_LIGHTLY_WEATHERED_IRON_BLOCK);
        register("waxed_iron_block", WAXED_IRON_BLOCK);
    }

    private static void register(String id, Item item) {
        Registry.register(Registry.ITEM, new Identifier(DogeonMod.MOD_ID, id), item);
    }
}
