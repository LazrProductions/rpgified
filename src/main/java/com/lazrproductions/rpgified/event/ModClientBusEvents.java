package com.lazrproductions.rpgified.event;

import com.lazrproductions.rpgified.RPGifiedMod;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RPGifiedMod.MODID, value = Dist.CLIENT)
public class ModClientBusEvents {
    @SubscribeEvent
    public static void onKeyInput(InputEvent.Key event) {

    }

    @SubscribeEvent
    public static void onMouseInput(InputEvent.MouseButton.Post event) {

    }
}
