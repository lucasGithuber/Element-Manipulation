package me.lucasgithuber.elementmanipulation.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import me.lucasgithuber.elementmanipulation.Items;

import me.lucasgithuber.elementmanipulation.utils.DeconstructorGUI;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;

import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;


public class EM_Deconstructor extends DeconstructorGUI implements RecipeDisplayItem {

    public EM_Deconstructor (ItemGroup c) {

        super(c, Items.EM_Deconstructor, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.POWER_CRYSTAL, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.POWER_CRYSTAL,
                SlimefunItems.REINFORCED_PLATE, SlimefunItems.NUCLEAR_REACTOR, SlimefunItems.REINFORCED_PLATE,
                SlimefunItems.REINFORCED_PLATE, SlimefunItems.LARGE_CAPACITOR, SlimefunItems.REINFORCED_PLATE
        });
        this.setProcessingSpeed(1).setCapacity(64).setEnergyConsumption(16);

    }

    public void registerDefaultRecipes() {

        registerRecipe(4, new ItemStack[] {new ItemStack(Material.WATER_BUCKET)},
                new ItemStack[] {new ItemStack(Material.BUCKET),
                        new CustomItemStack(Items.EM_Hydrogen, 2), new CustomItemStack(Items.EM_Oxygen, 1)
                });

        registerRecipe(4, new ItemStack[] {new ItemStack(Material.CARROT)},
                new ItemStack[] {new CustomItemStack(Items.EM_Carbon, 20),
                        new CustomItemStack(Items.EM_Hydrogen, 5)
                });

        registerRecipe(4, new ItemStack[] {new ItemStack(Material.COCOA_BEANS)},
                new ItemStack[] {new CustomItemStack(Items.EM_Carbon, 7),
                        new CustomItemStack(Items.EM_Hydrogen, 8), new CustomItemStack(Items.EM_Nitrogen,4),
                        new CustomItemStack(Items.EM_Oxygen, 2)
                });

        registerRecipe(4, new ItemStack[] {new ItemStack(Material.NETHER_WART)},
                new ItemStack[] {new CustomItemStack(Items.EM_Carbon, 19),
                        new CustomItemStack(Items.EM_Hydrogen, 14),
                        new CustomItemStack(Items.EM_Oxygen, 5),
                        new CustomItemStack(Items.EM_Sulfur,1),
                });

        registerRecipe(4, new ItemStack[] {new ItemStack(Material.POTATO)},
                new ItemStack[] {new CustomItemStack(Items.EM_Carbon, 6),
                        new CustomItemStack(Items.EM_Hydrogen, 10),
                        new CustomItemStack(Items.EM_Oxygen, 5),
                        new CustomItemStack(Items.EM_Nitrogen,1)
                });

        registerRecipe(4, new ItemStack[] {new ItemStack(Material.PUMPKIN_SEEDS)},
                new ItemStack[] {
                        new CustomItemStack(Items.EM_Hydrogen, 3),
                        new CustomItemStack(Items.EM_Oxygen, 2),
                });

        registerRecipe(4, new ItemStack[] {new ItemStack(Material.PUMPKIN_SEEDS)},
                new ItemStack[] {new CustomItemStack(Items.EM_Carbon, 19),
                        new CustomItemStack(Items.EM_Hydrogen, 14),
                        new CustomItemStack(Items.EM_Oxygen, 5),
                        new CustomItemStack(Items.EM_Sulfur,1),
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
    public ItemStack getProgressBar() {
        return new CustomItemStack(Material.EMERALD, "Deconstructing");
    }
    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "EM_DECONSTRUCTOR";
    }
    @Override
    public String getInventoryTitle() {
        return "&8Deconstructor";
    }
    @Override
    public int getCapacity() {
        return 256;
    }

    @Override
    public int getEnergyConsumption() {
        return 128;
    }

    @Override
    public int getSpeed() {
        return 1;
    }
        };
