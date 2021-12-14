package com.stemaria.mod.client.render;

import com.stemaria.mod.stems.StemsInit;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class RenderingHandler
{
    public static void init() {
    	StemsInit.stems.forEach(stem -> {
			ItemBlockRenderTypes.setRenderLayer(stem.getAttached().get(), RenderType.cutoutMipped());
			ItemBlockRenderTypes.setRenderLayer(stem.getStem().get(), RenderType.cutoutMipped());
    	});
    }
}
