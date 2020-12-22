package com.teamdraco.aintgotrythm.client;

import com.teamdraco.aintgotrythm.AintGotRythm;
import com.teamdraco.aintgotrythm.client.render.JuanRender;
import com.teamdraco.aintgotrythm.client.render.LilPPRender;
import com.teamdraco.aintgotrythm.init.ModEntities;
import com.teamdraco.aintgotrythm.objects.items.ModSpawnEggs;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AintGotRythm.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEventHandler {
    @OnlyIn(Dist.CLIENT)
    public static void init() {
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.JUAN.get(), JuanRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.LIL_PP.get(), LilPPRender::new);
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void itemColors(ColorHandlerEvent.Item event) {
        ItemColors handler = event.getItemColors();
        IItemColor eggColor = (stack, tintIndex) -> ((ModSpawnEggs) stack.getItem()).getColor(tintIndex);
        for (ModSpawnEggs e : ModSpawnEggs.UNADDED_EGGS) handler.register(eggColor, e);
    }
}
