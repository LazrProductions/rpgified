package com.lazrproductions.rpgified.init;

import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegisterEvent;

public class ModSounds {
    //public static final SoundEvent HANDCUFFED = SoundEvent
    //    .createVariableRangeEvent(new ResourceLocation(RPGifiedMod.MODID, "restraint.apply_handcuffs"));

    public static void register(RegisterEvent event) {
        event.register(Keys.SOUND_EVENTS, x -> {
            //x.register(new ResourceLocation(RPGifiedMod.MODID, "restraint.apply_handcuffs"), HANDCUFFED);
        });
    }
}
