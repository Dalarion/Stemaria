package com.stemaria.mod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.stemaria.mod.client.render.RenderingHandler;
import com.stemaria.mod.recipes.RecipesRegistry;
import com.stemaria.mod.stems.StemsInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(StemariaMod.mod_id)
public class StemariaMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String mod_id = "stemaria";
    public static final CreativeModeTab STEM = new StemariaGroup("stem");
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, mod_id);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, mod_id);

    public StemariaMod() {
    	
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::doClientStuff);
        
        StemsInit.register();
        ITEMS.register(bus);
        BLOCKS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	RecipesRegistry.registerRitualRecipes();
    }
    
    private void doClientStuff(final FMLClientSetupEvent event) 
    {
    	RenderingHandler.init();
    } 
    
    public static class StemariaGroup extends CreativeModeTab{
		public StemariaGroup(String label) {
			super(label);
		}
		@Override
		public ItemStack makeIcon() {
			return StemsInit.DIAMOND.getSeeds().get().getDefaultInstance();
		}
    }
}
