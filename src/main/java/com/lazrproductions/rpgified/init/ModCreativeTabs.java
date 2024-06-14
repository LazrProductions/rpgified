package com.lazrproductions.rpgified.init;

import com.lazrproductions.rpgified.RPGifiedMod;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, RPGifiedMod.MODID);

    // public static final RegistryObject<CreativeModeTab> RPGIFIED_TAB = CREATIVE_MODE_TABS.register("rpgified_tab",
    //         () -> CreativeModeTab.builder()
    //                 .title(Component.translatable("itemGroup.rpgified"))
    //                 .icon(() -> Items.getDefaultInstance())
    //                 .displayItems((parameters, output) -> {
    //                     //output.accept(ModItems.HANDCUFFS.get());
    //                 }).build());

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }
}
