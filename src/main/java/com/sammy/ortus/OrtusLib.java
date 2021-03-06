package com.sammy.ortus;

import com.sammy.ortus.helpers.OrtTestItem;
import com.sammy.ortus.setup.OrtusParticles;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.random.PositionalRandomFactory;
import net.minecraft.util.random.RandomGenerator;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.QuiltLoader;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class OrtusLib implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID= "ortus";
	public static final RandomGenerator RANDOM = RandomGenerator.createLegacy();

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("jesser where is the cocainer");
		OrtusParticles.init();
		if(QuiltLoader.isDevelopmentEnvironment()) {
			Registry.register(Registry.ITEM, id("ort"), new OrtTestItem(new QuiltItemSettings().rarity(Rarity.EPIC).group(ItemGroup.MISC)));
		}
	}
	public static Identifier id(String path) {
		return new Identifier(MODID, path);
	}
}
