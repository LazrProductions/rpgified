package com.lazrproductions.rpgified.init;

import com.lazrproductions.rpgified.RPGifiedMod;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
                        RPGifiedMod.MODID);

        // public static final RegistryObject<Block> REINFORCED_STONE = BLOCKS.register("reinforced_stone",
        //                 () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).mapColor(MapColor.METAL)
        //                                 .requiresCorrectToolForDrops().strength(6.0F, 12.0F)
        //                                 .pushReaction(PushReaction.IGNORE)));

        
        public static void register(IEventBus bus) {
                BLOCKS.register(bus);
        }
}
