package net.msrandom.beasts.common.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.msrandom.beasts.common.init.BeastsItems;

import java.util.function.Supplier;

public enum BeastArmorMaterials implements ArmorMaterial {
    SPARTAPOD("spartapod", 15, new int[]{2, 5, 6, 2}, 18,
            SoundEvents.ARMOR_EQUIP_IRON, 0.0F, () -> Ingredient.of(BeastsItems.ICON.get())),
    PUFFER("puffer", 25, new int[]{3, 6, 8, 3}, 20,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 0.5F, () -> Ingredient.of(BeastsItems.ICON.get()));

    private static final int[] DURABILITY_PER_SLOT = {13, 15, 16, 11}; // Base durability multipliers for helmet, chestplate, leggings, boots
    private final String name;
    private final int durabilityMultiplier;
    private final int[] defenseValues;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final LazyLoadedValue<Ingredient> repairMaterial;

    BeastArmorMaterials(String name, int durabilityMultiplier, int[] defenseValues, int enchantability,
                      SoundEvent equipSound, float toughness, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.defenseValues = defenseValues;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.repairMaterial = new LazyLoadedValue<>(repairMaterial);
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return 13;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return 13;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return "modid:" + this.name; // Replace "modid" with your actual mod ID
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F;
    }
}
