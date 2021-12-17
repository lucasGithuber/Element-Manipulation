package me.lucasgithuber.elementmanipulation.utils;


import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;


public class UsableInWorkbench extends SlimefunItem {
    @ParametersAreNonnullByDefault
    public UsableInWorkbench(ItemGroup itemGroup, SlimefunItemStack item, String id, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, id, recipeType, recipe);

        useableInWorkbench = true;
    }
}