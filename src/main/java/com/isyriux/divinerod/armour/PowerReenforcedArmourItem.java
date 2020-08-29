package com.isyriux.divinerod.armour;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class PowerReenforcedArmourItem extends ArmorItem {

    public PowerReenforcedArmourItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties properties) {
        super(materialIn, slot, properties);
    }

    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        return null;
    }
}