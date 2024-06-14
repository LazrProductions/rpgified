package com.lazrproductions.rpgified;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.lazrproductions.rpgified.config.RPGifiedCommonConfig;
import com.lazrproductions.rpgified.event.ModClientEvents;
import com.lazrproductions.rpgified.event.ModServerEvents;
import com.lazrproductions.rpgified.init.ModBlockEntities;
import com.lazrproductions.rpgified.init.ModBlocks;
import com.lazrproductions.rpgified.init.ModCreativeTabs;
import com.lazrproductions.rpgified.init.ModEffects;
import com.lazrproductions.rpgified.init.ModEnchantments;
import com.lazrproductions.rpgified.init.ModEntityTypes;
import com.lazrproductions.rpgified.init.ModItems;
import com.lazrproductions.rpgified.init.ModMenuTypes;
import com.lazrproductions.rpgified.init.ModModelLayers;
import com.lazrproductions.rpgified.init.ModRecipes;
import com.lazrproductions.rpgified.init.ModSounds;
import com.lazrproductions.rpgified.init.ModStatistics;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterClientTooltipComponentFactoriesEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.server.command.ConfigCommand;
import team.creative.creativecore.common.config.holder.CreativeConfigRegistry;

// The value e should match an entry in the META-INF/mods.toml file
@Mod(RPGifiedMod.MODID)
public class RPGifiedMod {
    public static final Logger LOGGER = LogManager.getLogger(RPGifiedMod.MODID);
    public static final String MODID = "RPGified";


    public static RPGifiedCommonConfig CONFIG;


    public static boolean BetterCombatInstalled = false;
    public static boolean EpicFightInstalled = false;
    public static boolean ParcoolInstalled = false;
    public static boolean ElenaiDodge2Installed = false;
    public static boolean IronsSpellsnSpellbooksInstalled = false;
    public static boolean ArsNouveauInstalled = false;

    public RPGifiedMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModEntityTypes.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModItems.register(modEventBus);
        ModEnchantments.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
        ModRecipes.register(modEventBus);
        ModEffects.register(modEventBus);
        ModStatistics.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::registerCaps);
        modEventBus.addListener(this::registerSounds);
        modEventBus.addListener(ModEntityTypes::registerAttributes);

		// if (ModList.get().isLoaded("bettercombat")) {
        //     BetterCombatInstalled = true;
        //     BetterCombatCompat.load();
        // }
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Running commmon setup for RPGified");

        ModStatistics.setup();

        MinecraftForge.EVENT_BUS.register(new ModServerEvents());

        CreativeConfigRegistry.ROOT.registerValue(MODID, CONFIG = new RPGifiedCommonConfig());
    }

    private void registerSounds(RegisterEvent event) {
        if(event.getRegistryKey().equals(Keys.SOUND_EVENTS)) {
            LOGGER.info("Registering sound for RPGified");
            ModSounds.register(event);
        }
    }
    private void registerCaps(RegisterCapabilitiesEvent event) {
        LOGGER.info("Registering Capabilities for RPGified");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Running server setup for RPGified");
    }

    @SubscribeEvent
    public void registerCommands(RegisterCommandsEvent event) {
        ConfigCommand.register(event.getDispatcher());
    }


    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("Running client setup for RPGified");

            MinecraftForge.EVENT_BUS.register(new ModClientEvents());
        }

        @SubscribeEvent
        public static void registerTooltip(RegisterClientTooltipComponentFactoriesEvent event) {
        }

        @SubscribeEvent
        public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            ModModelLayers.registerLayers(event);
        }

        @SubscribeEvent
        public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        }
    }
}