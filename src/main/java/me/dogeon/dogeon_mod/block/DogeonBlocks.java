package me.dogeon.dogeon_mod.block;

import me.dogeon.dogeon_mod.DogeonMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DogeonBlocks {

    public static final Block RUST;
    public static final Block SEMI_WEATHERED_IRON_BLOCK;
    public static final Block LIGHTLY_WEATHERED_IRON_BLOCK;
    public static final Block IRON_BLOCK;
    public static final Block WAXED_RUST;
    public static final Block WAXED_SEMI_WEATHERED_IRON_BLOCK;
    public static final Block WAXED_LIGHTLY_WEATHERED_IRON_BLOCK;
    public static final Block WAXED_IRON_BLOCK;

    static {
        RUST = new RustyIronBlock(AbstractBlock.Settings.copy(Blocks.SAND), Blocks.AIR);
        SEMI_WEATHERED_IRON_BLOCK = new RustyIronBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK), RUST);
        LIGHTLY_WEATHERED_IRON_BLOCK = new RustyIronBlock(
                AbstractBlock.Settings.copy(Blocks.IRON_BLOCK), SEMI_WEATHERED_IRON_BLOCK);
        IRON_BLOCK = new RustyIronBlock(
                AbstractBlock.Settings.copy(Blocks.IRON_BLOCK), LIGHTLY_WEATHERED_IRON_BLOCK);
        WAXED_RUST = new Block(AbstractBlock.Settings.copy(RUST));
        WAXED_SEMI_WEATHERED_IRON_BLOCK = new Block(AbstractBlock.Settings.copy(SEMI_WEATHERED_IRON_BLOCK));
        WAXED_LIGHTLY_WEATHERED_IRON_BLOCK = new Block(AbstractBlock.Settings
                .copy(LIGHTLY_WEATHERED_IRON_BLOCK));
        WAXED_IRON_BLOCK = new Block(AbstractBlock.Settings.copy(IRON_BLOCK));
    }

    public static void registerBlocks() {
        register("rust", RUST);
        register("semi_weathered_iron_block", SEMI_WEATHERED_IRON_BLOCK);
        register("lightly_weathered_iron_block", LIGHTLY_WEATHERED_IRON_BLOCK);
        register("iron_block", IRON_BLOCK);
        register("waxed_rust", WAXED_RUST);
        register("waxed_semi_weathered_iron_block", WAXED_SEMI_WEATHERED_IRON_BLOCK);
        register("waxed_lightly_weathered_iron_block", WAXED_LIGHTLY_WEATHERED_IRON_BLOCK);
        register("waxed_iron_block", WAXED_IRON_BLOCK);
    }

    private static void register(String id, Block block) {
        Registry.register(Registry.BLOCK, new Identifier(DogeonMod.MOD_ID, id), block);
    }
}
