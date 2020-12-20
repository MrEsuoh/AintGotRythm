package com.teamdraco.musicmania.client;

import com.teamdraco.musicmania.MusicMania;
import com.teamdraco.musicmania.client.render.JuanEntityRender;
import com.teamdraco.musicmania.init.ModEntities;
import com.teamdraco.musicmania.objects.items.ModSpawnEggs;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MusicMania.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEventHandler {
    @OnlyIn(Dist.CLIENT)
    public static void init() {
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.JUAN_ENTITY.get(), JuanEntityRender::new);
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void itemColors(ColorHandlerEvent.Item event) {
        ItemColors handler = event.getItemColors();
        IItemColor eggColor = (stack, tintIndex) -> ((ModSpawnEggs) stack.getItem()).getColor(tintIndex);
        for (ModSpawnEggs e : ModSpawnEggs.UNADDED_EGGS) handler.register(eggColor, e);
    }
}
