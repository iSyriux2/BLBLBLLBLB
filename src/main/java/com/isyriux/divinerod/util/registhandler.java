package com.isyriux.divinerod.util;

import com.isyriux.divinerod.DivineRodMod;
import com.isyriux.divinerod.armour.ModArmourMaterial;
import com.isyriux.divinerod.armour.PowerReenforcedArmourItem;
import com.isyriux.divinerod.items.Misc;
import com.isyriux.divinerod.tools.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.CombatEntry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.item.Item;

public class registhandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DivineRodMod.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    // ITEMS
    public static final RegistryObject<Item> IRON_STICK = ITEMS.register("iron_stick", Misc::new);
    public static final RegistryObject<SwordItem> DIVINE_ROD = ITEMS.register("divine_rod", () ->
            new SwordItem(ModItemTier.DIVINE, 2,4.0F,new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<Item> MELTED_POWER_DUST = ITEMS.register("melted_power_dust", Misc::new);
    public static final RegistryObject<Item> POWER_BALL = ITEMS.register("power_ball", Misc::new);
    public static final RegistryObject<Item> POWER_INGOT = ITEMS.register("power_ingot", Misc::new);
    public static final RegistryObject<Item> POWER_DUST = ITEMS.register("power_dust", Misc::new);
    public static final RegistryObject<Item> DIVINE_STICK = ITEMS.register("divine_stick", Misc::new);

    public static final RegistryObject<ArmorItem> POWER_HELMET = ITEMS.register("power_helmet", () ->
            new ArmorItem(ModArmourMaterial.POWER, EquipmentSlotType.HEAD,new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ArmorItem> POWER_CHESTPLATE = ITEMS.register("power_chestplate", () ->
            new ArmorItem(ModArmourMaterial.POWER, EquipmentSlotType.CHEST,new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<ArmorItem> POWER_REENFORCED_CHESTPLATE = ITEMS.register("power_reenforced_chestplate", () ->
            new PowerReenforcedArmourItem(ModArmourMaterial.POWER_REENFORCED, EquipmentSlotType.CHEST,new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<ArmorItem> POWER_LEGGINGS = ITEMS.register("power_leggings", () ->
            new ArmorItem(ModArmourMaterial.POWER, EquipmentSlotType.LEGS,new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<ArmorItem> POWER_SHOES = ITEMS.register("power_shoes", () ->
            new ArmorItem(ModArmourMaterial.POWER, EquipmentSlotType.FEET,new Item.Properties().group(ItemGroup.COMBAT)));

}
