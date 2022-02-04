package me.lucasgithuber.elementmanipulation.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.lucasgithuber.elementmanipulation.Items;
import me.lucasgithuber.elementmanipulation.elements.Elements;
import me.lucasgithuber.elementmanipulation.utils.UCGui;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

import static me.lucasgithuber.elementmanipulation.utils.Categories.EMElements;


public class EMUltraCompressor extends UCGui implements RecipeDisplayItem {

    public EMUltraCompressor(ItemGroup c) {

        super(c, Items.EMUltraCompressor, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.ELECTRIC_PRESS_2, SlimefunItems.ELECTRIC_PRESS_2, SlimefunItems.ELECTRIC_PRESS_2,
                SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.GLASS), SlimefunItems.REINFORCED_PLATE,
                SlimefunItems.REINFORCED_PLATE, SlimefunItems.LARGE_CAPACITOR, SlimefunItems.REINFORCED_PLATE
        });
        this.setProcessingSpeed(1).setCapacity(64).setEnergyConsumption(16);

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
