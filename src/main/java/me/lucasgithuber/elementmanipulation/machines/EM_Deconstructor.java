package me.lucasgithuber.elementmanipulation.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.SlimefunGuideItem;
import me.lucasgithuber.elementmanipulation.elements.Items;
import me.lucasgithuber.elementmanipulation.utils.MachinesGUI;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;


public class EM_Deconstructor extends MachinesGUI implements RecipeDisplayItem {

    public EM_Deconstructor(ItemGroup c) {

        super(c, Items.EM_Deconstructor, RecipeType.ANCIENT_ALTAR, new ItemStack[]{
                Items.EM_Hydrogen, SlimefunItems.ELECTRO_MAGNET, Items.EM_Oxygen,
                SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.ANCIENT_ALTAR, SlimefunItems.BLISTERING_INGOT_3,
                SlimefunItems.ANCIENT_PEDESTAL, SlimefunItems.HEATED_PRESSURE_CHAMBER, SlimefunItems.ANCIENT_PEDESTAL
        });
        this.setProcessingSpeed(1).setCapacity(64).setEnergyConsumption(16);

    }

    public void registerDefaultRecipes() {

        registerRecipe(8, new ItemStack[] {new ItemStack(Material.WATER_BUCKET)},
                new ItemStack[] {new ItemStack(Material.BUCKET),
                        new CustomItemStack(Items.EM_Hydrogen, 2), new CustomItemStack(Items.EM_Oxygen, 1)
                });
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.NETHERITE_PICKAXE);
    }

    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "EM_DECONSTRUCTOR";
    }
}