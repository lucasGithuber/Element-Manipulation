package me.lucasgithuber.elementmanipulation.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.lucasgithuber.elementmanipulation.Items;
import me.lucasgithuber.elementmanipulation.elements.Elements;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;


public class EMUltraCompressor extends AContainer implements RecipeDisplayItem {

    public EMUltraCompressor(ItemGroup c) {

        super(c, Items.EMUltraCompressor, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.ELECTRIC_PRESS_2, SlimefunItems.ELECTRIC_PRESS_2, SlimefunItems.ELECTRIC_PRESS_2,
                SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.GLASS), SlimefunItems.REINFORCED_PLATE,
                SlimefunItems.REINFORCED_PLATE, SlimefunItems.LARGE_CAPACITOR, SlimefunItems.REINFORCED_PLATE
        });
        this.setProcessingSpeed(1).setCapacity(64).setEnergyConsumption(16);

    }

    public void registerDefaultRecipes() {
        registerRecipe(15, new CustomItemStack(Elements.EMCarbon, 5),
                new ItemStack(Material.DIAMOND));
    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 2);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);
            displayRecipes.add(recipe.getOutput()[recipe.getOutput().length - 1]);
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
