package com.teamdraco.musicmania.init;

import com.teamdraco.musicmania.MusicMania;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
        MusicMania.MOD_ID);

    public static final Lazy<SoundEvent> LAZY_AMBIENT_ENDER_MUSIC = Lazy
            .of(() -> new SoundEvent(new ResourceLocation(MusicMania.MOD_ID, "disc.ambient_ender")));

    public static final RegistryObject<SoundEvent> SHATTER_MUSIC = SOUNDS.register("ambient_ender_music",
            LAZY_AMBIENT_ENDER_MUSIC);

}
