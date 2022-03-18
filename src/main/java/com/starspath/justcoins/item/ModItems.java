package com.starspath.justcoins.item;

import com.starspath.justcoins.JustCoins;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JustCoins.MOD_ID);

    public static final RegistryObject<Item> SILVER_COINS = ITEMS.register("silver_coin", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> GOLDEN_COINS = ITEMS.register("golden_coin", () ->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> CASH = ITEMS.register("cash", ()->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
