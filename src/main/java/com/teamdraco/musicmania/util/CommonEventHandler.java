package com.teamdraco.musicmania.util;

import com.teamdraco.musicmania.MusicMania;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.TableLootEntry;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MusicMania.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CommonEventHandler {

    @SubscribeEvent
    public static void lootLoad(LootTableLoadEvent event) {
        if (!event.getName().toString().equals("minecraft:entities/enderman")) {
            return;
        }
        String lootLocation = event.getName().toString().replace("minecraft:entities/enderman", "");

        event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(MusicMania.MOD_ID, "inject/enderman")).weight(1)).bonusRolls(0, 0).name("inject").build());
    }
}
