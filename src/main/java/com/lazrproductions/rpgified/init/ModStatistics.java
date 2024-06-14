package com.lazrproductions.rpgified.init;

import java.util.ArrayList;
import java.util.List;

import com.lazrproductions.rpgified.RPGifiedMod;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.StatFormatter;
import net.minecraft.stats.Stats;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModStatistics {
    private static final DeferredRegister<ResourceLocation> REGISTER = DeferredRegister.create(
			Registries.CUSTOM_STAT, RPGifiedMod.MODID
	);
	private static final List<Runnable> RUN_IN_SETUP = new ArrayList<>();


	//public static final RegistryObject<ResourceLocation> HANDCUFFS_TIME_RESTRAINED = registerCustomStat("handcuffs_times_restrained", StatFormatter.DEFAULT);


	public static void register(IEventBus bus)
	{
		REGISTER.register(bus);
	}

	public static void setup()
	{
		RUN_IN_SETUP.forEach(Runnable::run);
	}

	private static RegistryObject<ResourceLocation> registerCustomStat(String name, StatFormatter formatter)
	{
		return REGISTER.register(name, () -> {
			ResourceLocation regName = new ResourceLocation(RPGifiedMod.MODID, name);
			RUN_IN_SETUP.add(() -> Stats.CUSTOM.get(regName, formatter));
			return regName;
		});
	}
}
