package com.mysticalsurvival.excusmod.item;

import com.mysticalsurvival.excusmod.ExcusMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item MAGNA_CORE = registerItem("magna_core", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item MAGNA_CORE_SHARD = registerItem("magna_core_shard", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ExcusMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ExcusMod.LOGGER.info("Registering Mod Items for "+ExcusMod.MOD_ID);
    }
}
