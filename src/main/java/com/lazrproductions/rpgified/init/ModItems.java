package com.lazrproductions.rpgified.init;

import com.lazrproductions.rpgified.RPGifiedMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        RPGifiedMod.MODID);

        // Normal Items
        //public static final RegistryObject<Item> LOCKPICK = ITEMS.register("lockpick",
        //                () -> new Item(new Item.Properties().stacksTo(1).durability(3)));
                        

        // Block Items
        //public static final RegistryObject<Item> CELL_DOOR_ITEM = ITEMS.register("cell_door",
        //                () -> new BlockItem(ModBlocks.CELL_DOOR.get(), new Item.Properties()));

        public static void register(IEventBus bus) {
                ITEMS.register(bus);
        }
}
