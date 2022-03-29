package me.lucasgithuber.elementmanipulation.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.lucasgithuber.elementmanipulation.elements.Elements;
import me.lucasgithuber.elementmanipulation.gui.UCGui;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;


public class UltraCompressor extends UCGui implements RecipeDisplayItem {

    public UltraCompressor(ItemGroup c, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {

        super(c, item, recipeType, recipe);

    }

    public void registerDefaultRecipes() {
        registerRecipe(15,
                new ItemStack[]{
                        new CustomItemStack(Elements.CARBON, 64),
                        new CustomItemStack(Elements.CARBON, 64),
                        new CustomItemStack(Elements.CARBON, 64),
                        new CustomItemStack(Elements.CARBON, 64),

                },
                //output
                new ItemStack[]{new ItemStack(Material.DIAMOND)});
    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 8);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);

            for (ItemStack output : recipe.getOutput()) {
                displayRecipes.add(output);
                displayRecipes.add(new ItemStack(Material.AIR));
            }

            displayRecipes.add(new ItemStack(Material.AIR));
        }

        return displayRecipes;
    }
    @Override
    public ItemStack getProgressBar() {
        return new CustomItemStack(Material.PISTON, "Compressing");
    }
    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "EM_ULTRA_COMPRESSOR";
    }
    @Override
    public String getInventoryTitle() {
        return "&8Ultra compressor";
    }
    @Override
    public int getCapacity() {
        return 8192;
    }

    @Override
    public int getEnergyConsumption() {
        return 4096;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

}
