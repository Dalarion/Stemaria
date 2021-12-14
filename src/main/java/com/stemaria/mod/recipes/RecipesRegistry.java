package com.stemaria.mod.recipes;

import com.croparia.mod.core.recipes.RitualRecipe;
import com.stemaria.mod.stems.StemsInit;

public class RecipesRegistry {
	public static void registerRitualRecipes() {
		StemsInit.stems.forEach(stem -> {
			RitualRecipe.addRecipe("seed_stem_" + stem.getName(), stem.getCrop().getSeeds().get(), stem.getDrop().defaultBlockState(), stem.getSeeds().get(), 2);
		});
	}
}
