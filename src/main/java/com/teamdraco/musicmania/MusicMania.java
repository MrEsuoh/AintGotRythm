package com.teamdraco.musicmania;

import com.teamdraco.musicmania.client.ClientEventHandler;
import com.teamdraco.musicmania.entities.JuanEntity;
import com.teamdraco.musicmania.init.ItemInit;
import com.teamdraco.musicmania.init.ModEntities;
import com.teamdraco.musicmania.init.SoundInit;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MusicMania.MOD_ID)
public class MusicMania
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "musicmania";
    public static MusicMania instance;

    public MusicMania() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::registerCommon);
        modEventBus.addListener(this::registerClient);

        SoundInit.SOUNDS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        ModEntities.ENTITY_TYPES.register(modEventBus);
        //Blocks
        //TileEntity

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    public final static ItemGroup GROUP = new ItemGroup(MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.AMBIENT_ENDER_DISC.get());}
    };

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }

    private void registerCommon(FMLCommonSetupEvent event) {
        registerEntityAttributes();
        EntitySpawnPlacementRegistry.register(ModEntities.JUAN_ENTITY.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
    }

    private void registerClient(final FMLClientSetupEvent event) {
        ClientEventHandler.init();
    }

    private void registerEntityAttributes(){
        GlobalEntityTypeAttributes.put(ModEntities.JUAN_ENTITY.get(), JuanEntity.func_234176_m_().create());
    }

}
