package com.stemaria.mod.stems;

import com.croparia.mod.core.Crops;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.AttachedStemBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StemBlock;
import net.minecraft.world.level.block.StemGrownBlock;
import net.minecraftforge.registries.RegistryObject;

public class Stems {

	private String name;
	private RegistryObject<StemGrownBlock> block;
	private RegistryObject<AttachedStemBlock> attached;
	private RegistryObject<StemBlock> stem;
	private RegistryObject<ItemNameBlockItem> seeds;
	private Block drop;
	private Crops crop;
	
	public Stems(String name, Block block, Crops crop) {
		this.setName(name);
		this.drop = block;
		this.crop = crop;
	}
	
	public RegistryObject<StemGrownBlock> getBlock() {
		return this.block == null ? null : this.block;
	}
	
	public void setBlock(RegistryObject<StemGrownBlock> block) {
		this.block = block;
	}
	
	public RegistryObject<StemBlock> getStem() {
		return this.stem == null ? null : this.stem;
	}
	
	public void setStem(RegistryObject<StemBlock> stem) {
		this.stem = stem;
	}
	
	public RegistryObject<AttachedStemBlock> getAttached() {
		return this.attached == null ? null : this.attached;
	}
	
	public void setAttached(RegistryObject<AttachedStemBlock> attached) {
		this.attached = attached;
	}
	
	public RegistryObject<ItemNameBlockItem> getSeeds() {
		return this.seeds == null ? null : this.seeds;
	}
	
	public void setSeeds(RegistryObject<ItemNameBlockItem> seeds) {
		this.seeds = seeds;
	}

	public Block getDrop() {
		return drop;
	}

	public void setDrop(Block drop) {
		this.drop = drop;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Crops getCrop() {
		return crop;
	}

	public void setCrop(Crops crop) {
		this.crop = crop;
	}
}
