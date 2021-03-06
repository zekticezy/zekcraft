
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zekcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.zekcraft.block.SulfricAcidBlock;
import net.mcreator.zekcraft.block.ShitWorldPortalBlock;
import net.mcreator.zekcraft.block.ShitOreOreBlock;
import net.mcreator.zekcraft.block.ShitBlockBlock;
import net.mcreator.zekcraft.block.PissBlock;
import net.mcreator.zekcraft.block.HardwoodTrapdoorBlock;
import net.mcreator.zekcraft.block.HardwoodSlabBlock;
import net.mcreator.zekcraft.block.HardwoodPlanksBlock;
import net.mcreator.zekcraft.block.HardwoodFenceGatesBlock;
import net.mcreator.zekcraft.block.HardwoodFenceBlock;
import net.mcreator.zekcraft.block.HardwoodDoorBlock;
import net.mcreator.zekcraft.block.HardWoodBlock;
import net.mcreator.zekcraft.block.ComputerBlock;
import net.mcreator.zekcraft.block.ChickenBlockBlock;
import net.mcreator.zekcraft.block.BrazilBlockBlock;
import net.mcreator.zekcraft.block.BRAZILPortalBlock;
import net.mcreator.zekcraft.block.AverageJapaneseTreeLeavesBlock;
import net.mcreator.zekcraft.ZekcraftMod;

public class ZekcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ZekcraftMod.MODID);
	public static final RegistryObject<Block> PISS = REGISTRY.register("piss", () -> new PissBlock());
	public static final RegistryObject<Block> SULFRIC_ACID = REGISTRY.register("sulfric_acid", () -> new SulfricAcidBlock());
	public static final RegistryObject<Block> CHICKEN_BLOCK = REGISTRY.register("chicken_block", () -> new ChickenBlockBlock());
	public static final RegistryObject<Block> SHIT_BLOCK = REGISTRY.register("shit_block", () -> new ShitBlockBlock());
	public static final RegistryObject<Block> BRAZIL_BLOCK = REGISTRY.register("brazil_block", () -> new BrazilBlockBlock());
	public static final RegistryObject<Block> SHIT_ORE_ORE = REGISTRY.register("shit_ore_ore", () -> new ShitOreOreBlock());
	public static final RegistryObject<Block> AVERAGE_JAPANESE_TREE_LEAVES = REGISTRY.register("average_japanese_tree_leaves",
			() -> new AverageJapaneseTreeLeavesBlock());
	public static final RegistryObject<Block> HARD_WOOD = REGISTRY.register("hard_wood", () -> new HardWoodBlock());
	public static final RegistryObject<Block> HARDWOOD_PLANKS = REGISTRY.register("hardwood_planks", () -> new HardwoodPlanksBlock());
	public static final RegistryObject<Block> HARDWOOD_DOOR = REGISTRY.register("hardwood_door", () -> new HardwoodDoorBlock());
	public static final RegistryObject<Block> HARDWOOD_FENCE = REGISTRY.register("hardwood_fence", () -> new HardwoodFenceBlock());
	public static final RegistryObject<Block> HARDWOOD_FENCE_GATES = REGISTRY.register("hardwood_fence_gates", () -> new HardwoodFenceGatesBlock());
	public static final RegistryObject<Block> HARDWOOD_TRAPDOOR = REGISTRY.register("hardwood_trapdoor", () -> new HardwoodTrapdoorBlock());
	public static final RegistryObject<Block> HARDWOOD_SLAB = REGISTRY.register("hardwood_slab", () -> new HardwoodSlabBlock());
	public static final RegistryObject<Block> SHIT_WORLD_PORTAL = REGISTRY.register("shit_world_portal", () -> new ShitWorldPortalBlock());
	public static final RegistryObject<Block> BRAZIL_PORTAL = REGISTRY.register("brazil_portal", () -> new BRAZILPortalBlock());
	public static final RegistryObject<Block> COMPUTER = REGISTRY.register("computer", () -> new ComputerBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			HardwoodDoorBlock.registerRenderLayer();
			HardwoodFenceBlock.registerRenderLayer();
			HardwoodFenceGatesBlock.registerRenderLayer();
			HardwoodTrapdoorBlock.registerRenderLayer();
		}
	}
}
