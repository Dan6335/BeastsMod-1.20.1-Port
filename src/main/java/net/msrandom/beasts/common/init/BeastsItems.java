package net.msrandom.beasts.common.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.msrandom.beasts.common.BeastsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BeastsItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BeastsMod.MODID);

    public static final RegistryObject<Item> ICON = ITEMS.register("icon",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> BEASTS_PAINTING = ITEMS.register("beasts_painting",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAFY_BONE = ITEMS.register("leafy_bone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TUBEWORMS = ITEMS.register("tubeworms",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1F).build())));
    public static final RegistryObject<Item> DAGGERFISH = ITEMS.register("daggerfish",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).build())));
    public static final RegistryObject<Item> COOKED_EEL_CHOP = ITEMS.register("cooked_eel_chop",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(0.5F).build())));

    public static final RegistryObject<Item> SHRIMP = ITEMS.register("shrimp",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2F)
                    .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).build())));
    public static final RegistryObject<Item> RAW_KEBAB = ITEMS.register("raw_kebab",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3F)
                    .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).build())));

    //Todo: Create Puffer Armor Material
    /*public static final RegistryObject<Item> PUFFER_HELMET = ITEMS.register("puffer_helmet",
            () -> new ArmorItem(PufferArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> PUFFER_CHEST = ITEMS.register("puffer_chest",
            () -> new ArmorItem(PufferArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> PUFFER_LEGS = ITEMS.register("puffer_legs",
            () -> new ArmorItem(PufferArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> PUFFER_BOOTS = ITEMS.register("puffer_boots",
            () -> new ArmorItem(PufferArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Properties()));*/

    public static final RegistryObject<Item> COOKED_DAGGERFISH = ITEMS.register("cooked_daggerfish",
            () -> new SwordItem(BeastsItems.SWORD_FISH_MATERIAL, 4, -2.4F, new Item.Properties()));

    //Todo: Create Spartapod Armor Material
    /*public static final RegistryObject<Item> SPARTAPOD_HELMET = ITEMS.register("spartapod_helmet",
            () -> new ArmorItem(SpartapodArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAPOD_CHEST = ITEMS.register("spartapod_chest",
            () -> new ArmorItem(SpartapodArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAPOD_LEGS = ITEMS.register("spartapod_legs",
            () -> new ArmorItem(SpartapodArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> SPARTAPOD_BOOTS = ITEMS.register("spartapod_boots",
            () -> new ArmorItem(SpartapodArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Properties()));*/

    public static final ForgeTier SWORD_FISH_MATERIAL = new ForgeTier(2, 1400, 1.5f,
            2f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(BeastsItems.ICON.get()));
}