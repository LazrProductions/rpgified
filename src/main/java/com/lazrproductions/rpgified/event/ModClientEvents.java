package com.lazrproductions.rpgified.event;

import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModClientEvents {

    @SubscribeEvent
    public void clientTick(ClientTickEvent event) {

    }

    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {

    }

    @SubscribeEvent
    public void onPlayerLogout(PlayerEvent.PlayerLoggedOutEvent event) {

    }

    @SubscribeEvent
    public void onEntityDied(LivingDeathEvent event) {

    }

    @SubscribeEvent
    public void onLand(LivingFallEvent event) {

    }

    @SubscribeEvent
    public void onJump(LivingJumpEvent event) {
        
    }

    @SubscribeEvent
    public void renderGUI(RenderGuiOverlayEvent.Post event) {

    }
}
