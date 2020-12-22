package com.teamdraco.aintgotrythm.init;

import com.teamdraco.aintgotrythm.AintGotRythm;
import com.teamdraco.aintgotrythm.entities.JuanEntity;
import com.teamdraco.aintgotrythm.entities.LilPPEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, AintGotRythm.MOD_ID);

    public static final RegistryObject<EntityType<JuanEntity>> JUAN = create("juan",
            EntityType.Builder.create(JuanEntity::new, EntityClassification.CREATURE).size(1.0f, 1.0f));

    public static final RegistryObject<EntityType<LilPPEntity>> LIL_PP = create("lil_pp",
            EntityType.Builder.create(LilPPEntity::new, EntityClassification.CREATURE).size(0.6F, 1.95F));

    private static <T extends Entity> RegistryObject<EntityType<T>> create(String name, EntityType.Builder<T> builder) {
        return REGISTRY.register(name, () -> builder.build(AintGotRythm.MOD_ID + "." + name));
    }

}


