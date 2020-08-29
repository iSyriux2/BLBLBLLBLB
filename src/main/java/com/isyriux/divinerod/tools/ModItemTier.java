package com.isyriux.divinerod.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import com.isyriux.divinerod.util.registhandler;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    DIVINE(0,8000,2.0F,4.0F,24,() -> {
        return Ingredient.fromItems(registhandler.POWER_INGOT.get());
    });

    private final int harvestlLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestlLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial){
        this.harvestlLevel=harvestlLevel;
        this.maxUses=maxUses;
        this.efficiency=efficiency;
        this.attackDamage=attackDamage;
        this.enchantability=enchantability;
        this.repairMaterial=repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestlLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
