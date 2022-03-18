package com.starspath.justcoins.client.util;

import com.starspath.justcoins.JustCoins;
import com.starspath.justcoins.item.ModItems;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = JustCoins.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubcriber {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event){
        event.enqueueWork(() ->{

            ItemModelsProperties.register(ModItems.SILVER_COINS.get(), new ResourceLocation(JustCoins.MOD_ID, "size"), (itemStack, world, entity)->{
                return itemStack.getCount();
            });

            ItemModelsProperties.register(ModItems.GOLDEN_COINS.get(), new ResourceLocation(JustCoins.MOD_ID, "size"), (itemStack, world, entity)->{
                return itemStack.getCount();
            });

            ItemModelsProperties.register(ModItems.CASH.get(), new ResourceLocation(JustCoins.MOD_ID, "size"), (itemStack, world, entity)->{
                return itemStack.getCount();
            });
        });
    }
}
