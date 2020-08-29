package com.isyriux.divinerod.armour;

import com.isyriux.divinerod.DivineRodMod;
import com.isyriux.divinerod.util.registhandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.apache.commons.codec.language.Soundex;

import java.util.function.Supplier;

public enum ModArmourMaterial implements IArmorMaterial {

    POWER(DivineRodMod.MOD_ID+":power",45,new int[] {4,8,8,4}, 24, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2.0F, () -> {return Ingredient.fromItems(registhandler.POWER_INGOT.get());},1),
    POWER_REENFORCED(DivineRodMod.MOD_ID+":power_reenforced",45,new int[] {4,8,8,4}, 24, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2.0F, () -> {return Ingredient.fromItems(registhandler.POWER_INGOT.get());},1);


    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11,16,15,13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance;

    ModArmourMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability,
                      SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockbackResistance) {
        this.name=name;
        this.maxDamageFactor=maxDamageFactor;
        this.damageReductionAmountArray=damageReductionAmountArray;
        this.enchantability=enchantability;
        this.soundEvent=soundEvent;
        this.toughness=toughness;
        this.repairMaterial=repairMaterial;
        this.knockbackResistance=knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType equipmentSlotType) {
        return MAX_DAMAGE_ARRAY[equipmentSlotType.getIndex()]*this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType equipmentSlotType) {
        return this.damageReductionAmountArray[equipmentSlotType.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float func_230304_f_() {
        return this.knockbackResistance;
    }
}
