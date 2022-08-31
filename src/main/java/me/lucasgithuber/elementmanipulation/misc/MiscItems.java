package me.lucasgithuber.elementmanipulation.misc;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import me.lucasgithuber.elementmanipulation.ElementManipulation;
import me.lucasgithuber.elementmanipulation.utils.Categories;
import me.lucasgithuber.elementmanipulation.items.Materials;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

import static me.lucasgithuber.elementmanipulation.elements.Elements.*;

public class MiscItems {
    public static final SlimefunItemStack CLEAR_GLASS_1 = new SlimefunItemStack(
            "EM_CLEAR_GLASS_1",
            Material.GLASS_PANE,
            "&8Clear glass &7(33%)",
            "&8This glass is more clear than the common",
            "&8Because the heat separated its molecules"
    );
    public static final SlimefunItemStack CLEAR_GLASS_2 = new SlimefunItemStack(
            "EM_CLEAR_GLASS_2",
            Material.GLASS_PANE,
            "&7Clear glass &7(66%)",
            "&7This glass is very clearer than the common",
            "&7Because the heat separated its molecules",
            "&7too distant one from each other"
    );
    public static final SlimefunItemStack CLEAR_GLASS_3 = new SlimefunItemStack(
            "EM_CLEAR_GLASS_3",
            Material.GLASS_PANE,
            "&fClear glass",
            "&fThis glass is so clear that it seems",
            "&fThere's nothing in your way"
    );
    public static final SlimefunItemStack SYRINGE = new SlimefunItemStack(
            "EM_SYRINGE",
            Material.END_ROD,
            "&fSyringe",
            "&fUsed to put anesthesics"
    );
    public static final SlimefunItemStack RUBBER_PISTON = new SlimefunItemStack(
            "EM_RUBBER_PISTON",
            Material.BLACK_DYE,
            "&7Rubber piston",
            "&7Component of syringes"
    );
    public static void setup(ElementManipulation em){
        new UnplaceableBlock(Categories.MISCELLANEOUS, CLEAR_GLASS_1, RecipeType.SMELTERY, new ItemStack[]{
                new ItemStack(Material.GLASS_PANE), null, null,
                null, null, null,
                null, null, null
        }).register(em);
        new UnplaceableBlock(Categories.MISCELLANEOUS, CLEAR_GLASS_2, RecipeType.SMELTERY, new ItemStack[]{
                CLEAR_GLASS_1, null, null,
                null, null, null,
                null, null, null
        }).register(em);
        new UnplaceableBlock(Categories.MISCELLANEOUS, CLEAR_GLASS_3, RecipeType.SMELTERY, new ItemStack[]{
                CLEAR_GLASS_2, null, null,
                null, null, null,
                null, null, null
        }).register(em);
        new SlimefunItem(Categories.MISCELLANEOUS, RUBBER_PISTON, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SULFUR,SULFUR,SULFUR,
                SULFUR,CARBON,SULFUR,
                SULFUR,SULFUR,SULFUR,
        }).register(em);
        new UnplaceableBlock(Categories.MISCELLANEOUS, SYRINGE, RecipeType.SMELTERY, new ItemStack[]{
                SlimefunItems.PLASTIC_SHEET, null, SlimefunItems.PLASTIC_SHEET,
                SlimefunItems.PLASTIC_SHEET, null, SlimefunItems.PLASTIC_SHEET,
                SlimefunItems.PLASTIC_SHEET, RUBBER_PISTON, SlimefunItems.PLASTIC_SHEET
        }).register(em);
        
    }
}
