package me.lucasgithuber.elementmanipulation.items;

import javax.annotation.ParametersAreNonnullByDefault;

import io.github.mooy1.infinitylib.machines.MachineRecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemState;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class EMItemTest extends SlimefunItem {
    @ParametersAreNonnullByDefault
    public EMItemTest(ItemGroup itemGroup, ItemStack item, String id, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, id, recipeType, recipe);

        useableInWorkbench = true;
    }
}