package com.lazrproductions.rpgified.init;

import com.lazrproductions.rpgified.RPGifiedMod;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
public class ModEnchantments {
        public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister
                        .create(ForgeRegistries.ENCHANTMENTS, RPGifiedMod.MODID);

        public static void register(IEventBus bus) {
                ENCHANTMENTS.register(bus);
        }
}
