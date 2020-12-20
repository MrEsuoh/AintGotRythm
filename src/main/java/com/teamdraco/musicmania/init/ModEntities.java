package com.teamdraco.musicmania.init;

import com.teamdraco.musicmania.MusicMania;
import com.teamdraco.musicmania.entities.JuanEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, MusicMania.MOD_ID);

    public static final RegistryObject<EntityType<JuanEntity>> JUAN_ENTITY = ENTITY_TYPES.register("juan_entity",
            () -> EntityType.Builder.<JuanEntity>create(JuanEntity::new, EntityClassification.CREATURE)
                    .size(1.0f, 1.0f)
                    .build(new ResourceLocation(MusicMania.MOD_ID, "juan_entity").toString()));
}
