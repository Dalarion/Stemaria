package com.stemaria.mod.stems;

import java.util.ArrayList;
import java.util.List;

import com.croparia.mod.core.init.CropsInit;
import com.stemaria.mod.StemariaMod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class StemsInit {
	public static List<Stems> stems = new ArrayList<Stems>();

	public static final Stems COAL = new Stems("coal", Blocks.COAL_BLOCK, CropsInit.COAL);
	public static final Stems IRON = new Stems("iron", Blocks.IRON_BLOCK, CropsInit.IRON);
	public static final Stems GOLD = new Stems("gold", Blocks.GOLD_BLOCK, CropsInit.GOLD);
	public static final Stems REDSTONE = new Stems("redstone", Blocks.REDSTONE_BLOCK, CropsInit.REDSTONE); 
	public static final Stems LAPIS = new Stems("lapis", Blocks.LAPIS_BLOCK, CropsInit.LAPIS);
	public static final Stems DIAMOND = new Stems("diamond", Blocks.DIAMOND_BLOCK, CropsInit.DIAMOND);
	public static final Stems EMERALD = new Stems("emerald", Blocks.EMERALD_BLOCK, CropsInit.EMERALD);
	public static final Stems CLAY = new Stems("clay", Blocks.CLAY, CropsInit.CLAY);
	public static final Stems GLOWSTONE = new Stems("glowstone", Blocks.GLOWSTONE, CropsInit.GLOWSTONE);
	public static final Stems QUARTZ = new Stems("quartz", Blocks.QUARTZ_BLOCK, CropsInit.QUARTZ);
	public static final Stems SHARD = new Stems("shard", Blocks.PRISMARINE, CropsInit.SHARD);
	public static final Stems CRYSTAL = new Stems("crystal", Blocks.SEA_LANTERN, CropsInit.CRYSTAL);
	public static final Stems BONE = new Stems("bone", Blocks.BONE_BLOCK, CropsInit.BONE);
	public static final Stems SNOW = new Stems("snow", Blocks.SNOW_BLOCK, CropsInit.SNOWBALL);
	public static final Stems NETHER = new Stems("nether", Blocks.NETHER_BRICKS, CropsInit.NETHER);
	public static final Stems GLASS = new Stems("glass", Blocks.GLASS, CropsInit.BOTTLE);
	public static final Stems MAGMA = new Stems("magma", Blocks.MAGMA_BLOCK, CropsInit.MAGMA);
	public static final Stems SHELL = new Stems("shell", Blocks.SHULKER_BOX, CropsInit.SHELL);
	public static final Stems BEACON = new Stems("beacon", Blocks.BEACON, CropsInit.STAR);
	public static final Stems COBWEB = new Stems("cobweb", Blocks.COBWEB, CropsInit.STRING);
	public static final Stems SLIME = new Stems("slime", Blocks.SLIME_BLOCK, CropsInit.SLIME);
	public static final Stems OAK = new Stems("oak", Blocks.OAK_LOG, CropsInit.OAK);
	public static final Stems SPRUCE = new Stems("spruce", Blocks.SPRUCE_LOG, CropsInit.SPRUCE);
	public static final Stems BIRCH = new Stems("birch", Blocks.BIRCH_LOG, CropsInit.BIRCH);
	public static final Stems JUNGLE = new Stems("jungle", Blocks.JUNGLE_LOG, CropsInit.JUNGLE);
	public static final Stems ACACIA = new Stems("acacia", Blocks.ACACIA_LOG, CropsInit.ACACIA);
	public static final Stems DARKOAK = new Stems("darkoak", Blocks.DARK_OAK_LOG, CropsInit.DARKOAK);
	public static final Stems CHORUS = new Stems("chorus", Blocks.CHORUS_FLOWER, CropsInit.CHORUS);
	public static final Stems ORANGE = new Stems("orange", Blocks.ORANGE_TERRACOTTA, CropsInit.ORANGE);
	public static final Stems MAGENTA = new Stems("magenta", Blocks.MAGENTA_TERRACOTTA, CropsInit.MAGENTA);
	public static final Stems LIGHTBLUE = new Stems("lightblue", Blocks.LIGHT_BLUE_TERRACOTTA, CropsInit.LIGHTBLUE);
	public static final Stems YELLOW = new Stems("yellow", Blocks.YELLOW_TERRACOTTA, CropsInit.YELLOW);
	public static final Stems LIME = new Stems("lime", Blocks.LIME_TERRACOTTA, CropsInit.LIME);
	public static final Stems PINK = new Stems("pink", Blocks.PINK_TERRACOTTA, CropsInit.PINK);
	public static final Stems GRAY = new Stems("gray", Blocks.GRAY_TERRACOTTA, CropsInit.GRAY);
	public static final Stems SILVER = new Stems("silver", Blocks.LIGHT_GRAY_TERRACOTTA, CropsInit.SILVER);
	public static final Stems CYAN = new Stems("cyan", Blocks.CYAN_TERRACOTTA, CropsInit.CYAN);
	public static final Stems PURPLE = new Stems("purple", Blocks.PURPLE_TERRACOTTA, CropsInit.PURPLE);
	public static final Stems BROWN = new Stems("brown", Blocks.BROWN_TERRACOTTA, CropsInit.BROWN);
	public static final Stems GREEN = new Stems("green", Blocks.GREEN_TERRACOTTA, CropsInit.GREEN);
	public static final Stems RED = new Stems("red", Blocks.RED_TERRACOTTA, CropsInit.RED);
	public static final Stems BLACK = new Stems("black", Blocks.BLACK_TERRACOTTA, CropsInit.BLACK);
	public static final Stems BLUE = new Stems("blue", Blocks.BLUE_TERRACOTTA, CropsInit.BLUE);
	public static final Stems WHITE = new Stems("white", Blocks.WHITE_TERRACOTTA, CropsInit.WHITE);
	public static final Stems CONDUIT = new Stems("conduit", Blocks.CONDUIT, CropsInit.SEA);
	public static final Stems HONEYCOMB = new Stems("honeycomb", Blocks.HONEY_BLOCK, CropsInit.HONEYCOMB);
	public static final Stems NETHERITE = new Stems("netherite", Blocks.NETHERITE_BLOCK, CropsInit.NETHERITE);
	public static final Stems COPPER = new Stems("copper", Blocks.COPPER_BLOCK, CropsInit.COPPER);
	
	public static void register() {
		registry(COAL);
		registry(IRON);
		registry(GOLD);
		registry(REDSTONE);
		registry(LAPIS);
		registry(DIAMOND);
		registry(EMERALD);
		registry(CLAY);
		registry(GLOWSTONE);
		registry(QUARTZ);
		registry(SHARD);
		registry(CRYSTAL);
		registry(BONE);
		registry(SNOW);
		registry(NETHER);
		registry(GLASS);
		registry(MAGMA);
		registry(SHELL);
		registry(BEACON);
		registry(COBWEB);
		registry(SLIME);
		registry(OAK);
		registry(SPRUCE);
		registry(BIRCH);
		registry(JUNGLE);
		registry(ACACIA);
		registry(DARKOAK);
		registry(CHORUS);
		registry(ORANGE);
		registry(MAGENTA);
		registry(LIGHTBLUE);
		registry(YELLOW);
		registry(LIME);
		registry(PINK);
		registry(GRAY);
		registry(SILVER);
		registry(CYAN);
		registry(PURPLE);
		registry(BROWN);
		registry(GREEN);
		registry(RED);
		registry(BLACK);
		registry(BLUE);
		registry(WHITE); 
		registry(CONDUIT);
		registry(HONEYCOMB);
		registry(NETHERITE);
		registry(COPPER);
	}

	private static void registry(Stems stem) {
		stems.add(stem);
		stem.setBlock(StemariaMod.BLOCKS.register(stem.getName() + "_plant", () -> new StemGrownBlock(BlockBehaviour.Properties.of(Material.VEGETABLE, MaterialColor.COLOR_LIGHT_GREEN).strength(1.0F).sound(SoundType.WOOD)) {
			@Override
			public StemBlock getStem() {
				return stem.getStem().get();
			}

			@Override
			public AttachedStemBlock getAttachedStem() {
				return stem.getAttached().get();
			}
		}));
		stem.setAttached(StemariaMod.BLOCKS.register("attached_" + stem.getName() + "_stem", () -> new AttachedStemBlock(stem.getBlock().get(), () -> stem.getSeeds().get(),BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.HARD_CROP))));
		stem.setStem(StemariaMod.BLOCKS.register(stem.getName() + "_stem", () -> new StemBlock(stem.getBlock().get(), () -> stem.getSeeds().get(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.HARD_CROP))));
	
		stem.setSeeds(StemariaMod.ITEMS.register("seed_stem_" + stem.getName(), () -> new ItemNameBlockItem(stem.getStem().get(), new Item.Properties().tab(StemariaMod.STEM))));
	}
}
