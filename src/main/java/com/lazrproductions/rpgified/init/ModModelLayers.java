package com.lazrproductions.rpgified.init;

import com.lazrproductions.rpgified.RPGifiedMod;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = RPGifiedMod.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModModelLayers {
	//public static final ModelLayerLocation CHAIN_KNOT_LAYER = new ModelLayerLocation(new ResourceLocation(RPGifiedMod.MODID, "chain_knot"), "main");

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        //event.registerLayerDefinition(CHAIN_KNOT_LAYER, ChainKnotEntityModel::getModelData);
    }
}
