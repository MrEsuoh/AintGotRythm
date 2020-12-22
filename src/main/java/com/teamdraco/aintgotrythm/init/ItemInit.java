package com.teamdraco.aintgotrythm.init;

import com.teamdraco.aintgotrythm.AintGotRythm;
import com.teamdraco.aintgotrythm.objects.items.ModSpawnEggs;
import com.teamdraco.aintgotrythm.objects.items.ModMusicDiscItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AintGotRythm.MOD_ID);

    //Items

    public static final RegistryObject<Item> WHEAT_CRISPER = ITEMS.register("wheat_crisper",
            () -> new Item(new Item.Properties().group(AintGotRythm.GROUP).food(new Food.Builder().hunger(2).saturation(0.5f).build())));

   /* public static final RegistryObject<Item> SHELLAC = ITEMS.register("shellac",
            () -> new Item(new Item.Properties().group(AintGotRythm.GROUP))); */

    //Discs

    public static final RegistryObject<Item> AMBIENT_ENDER_DISC = ITEMS.register("music_disc_ambient_ender",
            () -> new ModMusicDiscItem(20, SoundInit.LAZY_AMBIENT_ENDER_MUSIC.get(),
                    new Item.Properties().group(AintGotRythm.GROUP).maxStackSize(1).rarity(Rarity.RARE)));

    //Eggs
    public static final RegistryObject<ModSpawnEggs> JUAN_SPAWN_EGG = ITEMS.register("juan_spawn_egg",
            () -> new ModSpawnEggs(ModEntities.JUAN, 0x2a2e33, 0x9fa2a6,
                    new Item.Properties().group(AintGotRythm.GROUP).maxStackSize(16)));

    public static final RegistryObject<ModSpawnEggs> LIL_PP_SPAWN_EGG = ITEMS.register("lil_pp_spawn_egg",
            () -> new ModSpawnEggs(ModEntities.LIL_PP, 0x4d320b, 0xb59d79,
                    new Item.Properties().group(AintGotRythm.GROUP).maxStackSize(16)));



}
