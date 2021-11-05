package me.lucasgithuber.elementmanipulation.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.Items;
import me.lucasgithuber.elementmanipulation.utils.JunctionGUI;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.configuration.Configuration;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;


public class EM_JunctionTable extends JunctionGUI implements RecipeDisplayItem {

    public EM_JunctionTable(ItemGroup c) {

        super(c, Items.EM_Junction_table, RecipeType.ANCIENT_ALTAR, new ItemStack[]{
                Items.EM_Hydrogen, SlimefunItems.ELECTRO_MAGNET, Items.EM_Oxygen,
                SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.ANCIENT_ALTAR, SlimefunItems.BLISTERING_INGOT_3,
                SlimefunItems.ANCIENT_PEDESTAL, SlimefunItems.HEATED_PRESSURE_CHAMBER, SlimefunItems.ANCIENT_PEDESTAL
        });
        this.setProcessingSpeed(1).setCapacity(1000000).setEnergyConsumption(2048);

    }

    ItemStack item;
    //getting config just like apeiros
    ElementManipulation em = ElementManipulation.i();
    Configuration cfg = em.getConfig();
    public void registerDefaultRecipes() {
// adding recipes
        registerRecipe(4, new ItemStack[] {new CustomItemStack(Items.EM_Hydrogen, 2), new CustomItemStack(Items.EM_Oxygen), new ItemStack(Material.BUCKET)},
                new ItemStack[] {new ItemStack(Material.WATER_BUCKET)
                });
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
    public ItemStack getProgressBar(){
        return new CustomItemStack(Material.EMERALD_BLOCK, "&aConstructing");
    }
    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "EM_JUNCTIONTABLE";
    }
}