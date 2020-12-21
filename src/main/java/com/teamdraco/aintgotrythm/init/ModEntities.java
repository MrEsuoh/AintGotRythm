package com.teamdraco.aintgotrythm.init;

import com.teamdraco.aintgotrythm.AintGotRythm;
import com.teamdraco.aintgotrythm.entities.JuanEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, AintGotRythm.MOD_ID);

    public static final RegistryObject<EntityType<JuanEntity>> JUAN_ENTITY = create("juan_entity",
            EntityType.Builder.create(JuanEntity::new, EntityClassification.CREATURE).size(1.0f, 1.0f));

    private static <T extends Entity> RegistryObject<EntityType<T>> create(String name, EntityType.Builder<T> builder) {
        return REGISTRY.register(name, () -> builder.build(AintGotRythm.MOD_ID + "." + name));
    }

}


