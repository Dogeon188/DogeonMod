package me.dogeon.dogeon_mod.item;

import me.dogeon.dogeon_mod.DogeonMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class DogeonItemGroup {
    public static final ItemGroup GENERAL = FabricItemGroupBuilder
            .create(new Identifier(DogeonMod.MOD_ID, "general"))
            .icon(() -> new ItemStack(DogeonItems.IRON_BLOCK))
            .build();
}
