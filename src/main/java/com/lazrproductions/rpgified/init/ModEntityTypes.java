package com.lazrproductions.rpgified.init;

import com.lazrproductions.rpgified.RPGifiedMod;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
        public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister
                        .create(ForgeRegistries.ENTITY_TYPES, RPGifiedMod.MODID);

        // public static RegistryObject<EntityType<ChainKnotEntity>> CHAIN_KNOT =
        // ENTITY_TYPES.register("chain_knot",
        // () -> EntityType.Builder.<ChainKnotEntity>of(ChainKnotEntity::new,
        // MobCategory.MISC)
        // .clientTrackingRange(10)
        // .updateInterval(Integer.MAX_VALUE)
        // .setShouldReceiveVelocityUpdates(false)
        // .sized(6 / 16f, 0.5f).canSpawnFarFromPlayer().fireImmune()
        // .build(new ResourceLocation(RPGifiedMod.MODID, "chain_knot").toString()));

        public static void register(IEventBus bus) {
                ENTITY_TYPES.register(bus);
        }

        public static void registerAttributes(EntityAttributeCreationEvent event) {
                // event.put(ModEntityTypes.WEIGHTED_ANCHOR.get(),
                // WeightedAnchorEntity.createAttributes().build());
        }
}